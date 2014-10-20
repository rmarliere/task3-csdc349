/**
 * Author: Rodrigo Marliere
 * Revision date: 10/20/14
 * Assignment: Task 3
 * Class: CSCD 349
 */

public interface I_Submarine extends I_Vehicle
{
    public A_Powerplant getPowerplantPrimary();

    public A_Powerplant getPowerplantSecondary();

    public void isPrimaryOrSecondary(boolean isSecondary);

    public boolean isPrimaryOrSecondary();

    public void removePowerplantPrimary();

    public void removePowerplantSecondary();

    public boolean hasPowerplantPrimary();

    public boolean hasPowerplantSecondary();

    public void installPowerplantPrimary(A_Powerplant powerplant1);

    public void installPowerplantSecondary(A_Powerplant powerplant2);
}
