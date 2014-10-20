/**
 * Author: Rodrigo Marliere
 * Revision date: 10/17/14
 * Assignment: Task 3
 * Class: CSCD 349
 */

public abstract class A_Powerplant implements I_Powerplant
{
    private final String _id;
    private A_Vehicle _host;

    public A_Powerplant(String id)
    {
        if (id == null)
        {
            throw new NullPointerException();
        }

        _id = id;
    }

    public String getID()
    {
        return _id;
    }

    public void setHost(A_Vehicle host)
    {
        if(_host != null)
        {
            throw new RuntimeException("the host is already set: " + _host.getID());
        }
        _host = host;
    }

    public A_Vehicle getHost()
    {
        if(_host == null)
        {
            throw new RuntimeException("there is no host yet");
        }
        return _host;
    }

    public void removeHost()
    {
        if(_host == null)
        {
            throw new RuntimeException("there is no host yet");
        }
        _host = null;
    }

    public boolean hasHost()
    {
        return _host != null;
    }
}
