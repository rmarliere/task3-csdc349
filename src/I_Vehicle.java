/**
 * Author: Rodrigo Marliere
 * Revision date: 10/17/14
 * Assignment: Task 3
 * Class: CSCD 349
 */

public interface I_Vehicle extends I_id
{
    public String getID();

    public String getIDSalted();

    public A_Powerplant getPowerplant();

    public void removePowerplant();

    public void installPowerplant(A_Powerplant powerplant);

    public boolean hasPowerplant();

    public void move();
}
