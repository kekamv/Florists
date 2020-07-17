package Controller;

import Products.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Florists {
	
	Scanner scn=new Scanner(System.in);
	String name;
    String entryStr;
    double entryNum=0;
    Material material;
    Tree tree;
    Flower flower;
    Decorative decorative;

    List<Tree> treesInStock= new ArrayList<>();
    List<Flower> flowersInStock = new ArrayList<>();
    List <Decorative> decorativesInStock = new ArrayList<>();

    //This method is actually intended for the FloristsMenu, to be called in the main 
    public void setName() {
    	System.out.println("Enter the name of the florist: ");
    	notNullString();
    	name=entryStr;
    }
    
    //getName method could also be used in class FloristsMenu
    public String getName() {
    	return name;
    }
    
    
    //Method to return the items in stock classified by type, pending to develop
    public void getStock() {

    	StringBuilder stock=new StringBuilder("Products in stock on ");
        stock.append(LocalDate.now());
        stock.append(" :\n");
        System.out.println(stock);

        System.out.println("Trees: \n");
        for(Tree t :treesInStock) System.out.println(t.toString());

        System.out.println("Flowers: \n");
        for(Flower f :flowersInStock) System.out.println(f.toString());

        System.out.println("Decorative items: \n");
        for(Decorative d: decorativesInStock) System.out.println(d.toString());

    }
    
    
   //Method to create a tree, includes it in treesInStock list and prints the tree's toString
    public void createTree(){
        System.out.println("Please enter the tree's height");
        checkDouble();
        double height= entryNum;
        System.out.println("Please enter the price");
        checkDouble();
        double price = entryNum;
        tree = new Tree(price, height);
        treesInStock.add(tree);
        System.out.println("New item created: ");
        System.out.print(tree.toString());
    }

    
    //Method to create a flower, includes it in flowersInStock list and prints the flower's toString
    public void createFlower(){
        System.out.println("Please enter the flower's colour");
        notNullString();
        String colour= entryStr;
        System.out.println("Please enter the price");
        checkDouble();
        double price = entryNum;
        flower = new Flower(price, colour);
        flowersInStock.add(flower);
        System.out.println("New item created: ");
        System.out.print(flower.toString());
    }
    
    //Method to create a decorative, includes it in decorativesInStock list and prints the decorative's toString
    public void createDecorative(){
        System.out.println("Please enter the decorative's material, either WOODEN or PLASTIC");
        enumValidationMaterial();
        material = Material.valueOf(entryStr.toUpperCase());
        System.out.println("Please enter the price");
        checkDouble();
        double price = entryNum;
        decorative = new Decorative(price, material);
        decorativesInStock.add(decorative);
        System.out.println("New item created: ");
        System.out.print(decorative.toString());
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

    public String enumValidationMaterial(){
        entryStr=scn.nextLine();
        if(!entryStr.equalsIgnoreCase(String.valueOf(Material.PLASTIC))&&!entryStr.equalsIgnoreCase(String.valueOf(Material.WOODEN))){
            System.out.println("Please enter a valid material");
            enumValidationMaterial();
        }
        return entryStr;
    }

    /*
    System.out.println("To add a new Decorative Item  please enter either 1 or 2 to choose the material type :"+
                            "\n1: Wooden "+"n2:Plastic");
    */
    

    }