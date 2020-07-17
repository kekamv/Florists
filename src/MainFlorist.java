import Controller.Florists;
import Controller.MenuFlorists;

import java.util.Scanner;

/**Main of the program
 * @author enric
 */

public class MainFlorist {

    public static void main(String[] args){

        //The menu of interaction with the Florist is created
        MenuFlorists menuFlorist = new MenuFlorists ();

        //Runs the interacting menu
        menuFlorist.menuFlorists();

    }
}
