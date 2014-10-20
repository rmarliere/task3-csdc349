/**
 * Author: Rodrigo Marliere
 * Revision date: 10/17/14
 * Assignment: Task 3
 * Class: CSCD 349
 */

public class IdentifierSaltManager
{
    private static IdentifierSaltManager _instance = null;
    private Integer _salt = 1;

    public static IdentifierSaltManager getInstance()
    {
        if (_instance == null)
        {
            _instance = new IdentifierSaltManager();
        }
        return _instance;
    }

    private IdentifierSaltManager()
    {

    }

    public String getIDSalted(String id)
    {
        return id + '#' + getSaltNext();
    }

    private Integer getSaltNext()
    {
        return _salt++;
    }
}
