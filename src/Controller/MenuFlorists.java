package Controller;

import java.util.Scanner;

public class MenuFlorists {

    String name;

    public MenuFlorists(String name){
        this.name = name;
    }

    public void menuFlorists(){

        String option, data1, data2;

        boolean menu = true;

        Scanner input = new Scanner(System.in);

        Florists florist = new Florists();

        florist.setName();

        name = florist.getName();

        while(menu){
            System.out.println("Florist "+name+" | What do you want to do?"
                                + "\n 1: Add a tree."
                                + "\n 2: Add a flower."
                                + "\n 3: Add a decorative."
                                + "\n 4: Show stock."
                                + "\n 5: Exiting the program."
                                );
            option = input.nextLine();

            switch(option){
                case "1":
                    //Add ValidEntries methods
                    florist.createTree();
                    break;
                case "2":
                    //Add ValidEntries methods
                    florist.createFlower();
                    break;
                case "3":
                    //Add ValidEntries methods
                    florist.createDecorative();
                    break;
                case "4":
                    florist.getStock();
                    break;
                case "5":
                    System.out.println("Program finished.");
                    input.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Incorrect data, select a correct option.");
            }

        }

        input.close();

    }

}
