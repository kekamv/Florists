import Controller.Florists;
import Controller.MenuFlorists;

import java.util.Scanner;

/**Main of the program
 * @author enric
 */

public class MainFlorist {

    public static void main(String[] args){

        String name;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the name of the florist: ");
        name = input.nextLine();


        //The menu of interaction with the Florist is created
        MenuFlorists menuFlorist = new MenuFlorists (name);

        //Runs the interacting menu
        menuFlorist.menuFlorists();

        Florists myFlorist=new Florists();
        //myFlorist.createTree();
        //myFlorist.createFlower();
        //myFlorist.createDecorative();

        input.close();
    }
}
