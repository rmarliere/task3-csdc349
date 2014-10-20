/**
 * Author: Rodrigo Marliere
 * Revision date: 10/17/14
 * Assignment: Task 3
 * Class: CSCD 349
 */

public class PowerplantTurbojet extends A_Powerplant
{
    public PowerplantTurbojet(String id) {
        super(id);
    }

    public String generate()
    {
        return "exhausting a jet";
    }
}
