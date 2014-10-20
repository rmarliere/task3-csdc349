/**
 * Author: Rodrigo Marliere
 * Revision date: 10/17/14
 * Assignment: Task 3
 * Class: CSCD 349
 */

public abstract class A_Vehicle implements I_Vehicle
{
    public final String _id;
    public final String _saltedId;

    public A_Powerplant _powerplant;

    public A_Vehicle(String id, A_Powerplant powerplant)
    {
        if (id == null)
        {
            throw new NullPointerException();
        }

        IdentifierSaltManager salt = IdentifierSaltManager.getInstance();
        _id         = id;
        _saltedId   = salt.getIDSalted(_id);

        if (powerplant != null)
        {
            _powerplant = powerplant;
            _powerplant.setHost(this);
        }
    }

    public String getID()
    {
        return _id;
    }

    public String getIDSalted()
    {
        return _saltedId;
    }

    public boolean isPowerplantNull(A_Powerplant powerplant)
    {
        if (powerplant == null)
        {
            throw new RuntimeException("no installed powerplant");
        }
        return false;
    }

    public A_Powerplant getPowerplant()
    {
        isPowerplantNull(_powerplant);
        return _powerplant;
    }

    public void removePowerplant()
    {
        isPowerplantNull(_powerplant);
        _powerplant.removeHost();
        _powerplant = null;
    }

    public void installPowerplant(A_Powerplant powerplant)
    {
        if (_powerplant != null)
        {
            throw new RuntimeException("powerplant " + _powerplant.getID() + " already installed");
        }
        powerplant.setHost(this);
        _powerplant = powerplant;
    }

    public boolean hasPowerplant()
    {
        return !(_powerplant == null);
    }

    public void move()
    {
        if (_powerplant == null)
        {
            System.out.println("no powerplant");
        }
        else
        {
            System.out.println(_saltedId + ":" + _powerplant.generate());
        }
    }
}
