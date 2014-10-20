/**
 * Author: Rodrigo Marliere
 * Revision date: 10/17/14
 * Assignment: Task 3
 * Class: CSCD 349
 */

public abstract class A_Submarine extends A_Vehicle implements I_Submarine
{
    private boolean _isSecondary;
    private A_Powerplant _powerplant_2;

    public A_Submarine (String id, A_Powerplant powerplant, A_Powerplant powerplant_2)
    {
        super(id, powerplant);
        if (powerplant != null && powerplant.equals(powerplant_2))
        {
            throw new RuntimeException("the powerplants can`t be the same");
        }

        if (powerplant_2 != null)
        {
            _powerplant_2 = powerplant_2;
            _powerplant_2.setHost(this);
        }
    }

    public A_Powerplant getPowerplantPrimary()
    {
        return super.getPowerplant();
    }

    public A_Powerplant getPowerplantSecondary()
    {
        super.isPowerplantNull(_powerplant_2);
        return _powerplant_2;
    }

    public void isPrimaryOrSecondary(boolean isSecondary)
    {
        _isSecondary = isSecondary;
    }

    public boolean isPrimaryOrSecondary()
    {
        return _isSecondary;
    }

    public void removePowerplantPrimary()
    {
        super.removePowerplant();
    }

    public void removePowerplantSecondary()
    {
        isPowerplantNull(_powerplant_2);
        _powerplant_2.removeHost();
        _powerplant_2 = null;
    }

    public boolean hasPowerplantPrimary()
    {
        return super.hasPowerplant();
    }

    public boolean hasPowerplantSecondary()
    {
        return !(_powerplant_2 == null);
    }

    public void installPowerplantPrimary(A_Powerplant powerplant1)
    {
        super.installPowerplant(powerplant1);
    }

    public void installPowerplantSecondary(A_Powerplant powerplant_2)
    {
        if (_powerplant_2 != null)
        {
            throw new RuntimeException("powerplant " + _powerplant_2.getID() + " already installed");
        }
        powerplant_2.setHost(this);
        _powerplant_2 = powerplant_2;
    }
}
