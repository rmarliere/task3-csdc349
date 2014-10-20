/**
 * Author: Rodrigo Marliere
 * Revision date: 10/17/14
 * Assignment: Task 3
 * Class: CSCD 349
 */

public interface I_Powerplant
{
    public String getID();

    public void setHost(A_Vehicle host);

    public A_Vehicle getHost();

    public void removeHost();

    public boolean hasHost();

    public String generate();

}
