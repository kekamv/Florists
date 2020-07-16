package Controller;

import Products.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Florists {
	
	Scanner scn=new Scanner(System.in);

    String entryStr;
    double entryNum=0;
    Tree tree;
    Flower flower;
    Decorative decorative;

    List<Tree> treesInStock= new ArrayList<>();
    List<Flower> flowersInStock = new ArrayList<>();
    List <Decorative> decorativeInStock = new ArrayList<>();
   /* Product productsInStock [];

    public Florists() {
        productsInStock = new Product[]{(Product) treesInStock, (Product) flowersInStock, (Product) decorativeInStock};
    }
*/
   //Method to create a tree, includes in treesInStock list and prints the tree's toString
    public void createTree(){
        System.out.println("Please enter the tree's height");
        checkDouble();
        double height= entryNum;
        System.out.println("Please enter the price");
        checkDouble();
        double price = entryNum;
        tree = new Tree(price, height);
        treesInStock.add(tree);
        System.out.println("Created: ");
        System.out.print(tree.toString());
    }

    
    //Method to create a flower, includes in treesInStock list and prints the tree's toString
    public void createFlower(){
        System.out.println("Please enter the flower's colour");
        notNullString();
        String colour= entryStr;
        System.out.println("Please enter the price");
        checkDouble();
        double price = entryNum;
        flower = new Flower(price, colour);
        flowersInStock.add(flower);
        System.out.println("Created: ");
        System.out.print(flower.toString());
    }


    /*Method to pick up and check an entry when the system expects a double, includes recursive call
    @return the user's entry value as a double
     */

    public double checkDouble(){
        entryStr=scn.nextLine();
        try {
        	 if (entryNum !=Double.parseDouble(entryStr)) { 
             }
        }catch (NumberFormatException nfe) {
        	 System.out.println("Invalid entry, please try again");
             checkDouble();
		}
    
        entryNum=Double.parseDouble(entryStr);
        if (entryNum<=0) {
        	System.out.println("Invalid entry, please enter a value greater than 0");
        	checkDouble();
        }
        return entryNum;
    }

    /*Method to check an entry when the system expects a number
    @param value entered by the user
    @return true in case number, false otherwise
     */
    public boolean isNumeric(String strNum){
        if(strNum==null) return false;

        try{
            @SuppressWarnings(value = "unused")
            int i=Integer.parseInt(strNum);
        }catch (NumberFormatException nfe){
            return false;
        }
        return true;
    }

    /*Method to pick up and check an entry when the system expects a string, includes recursive call
   @return the user's entry value as a string if it is not null, not empty and doesn't start with " "
    */
    public String notNullString(){
        entryStr=scn.nextLine();
        if(entryStr!=null) {
            if(!entryStr.isEmpty()){
                if(!entryStr.startsWith(" ")){
                    return entryStr;
                } else {
                    System.out.println("Please enter the requested value");
                    notNullString();
                }
            }else {
                System.out.println("An empty entry is not allowed, please try again");
                notNullString();
            }
        }else {
            System.out.println("Your entry should not start with an empty space, please try again");
            notNullString();
        }
        return entryStr;
    }

    public Material enumValidationMaterial(){
        entryStr=scn.nextLine();
        if(!entryStr.equalsIgnoreCase(String.valueOf(Material.PLASTIC))||!entryStr.equalsIgnoreCase(String.valueOf(Material.WOODEN))){
            System.out.println("Please enter a valid material");
            enumValidationMaterial();
        }
        return Material.valueOf(entryStr.toUpperCase());
    }

    /*
    System.out.println("To add a new Decorative Item  please enter either 1 or 2 to choose the material type :"+
                            "\n1: Wooden "+"n2:Plastic");
    */
    

    }