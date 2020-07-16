package Controller;

import Products.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Florists {

    String entryStr="";
    double entryNum=0;

    List<Tree> treesInStock= new ArrayList<Tree>();
    List<Flower> flowersInStock = new ArrayList<Flower>();
    List <Decorative> decorativeInStock = new ArrayList<Decorative>();
    Product productsInStock [] = {(Product) treesInStock, (Product) flowersInStock, (Product) decorativeInStock};

    /*Method to pick up and check an entry when the system expects a double, includes recursive call
    @return the user's entry value as a double
     */

    public double checkDouble(){
        Scanner scn= new Scanner(System.in);
        entryStr=scn.nextLine();
        if (!isNumeric(entryStr)) {
            System.out.println("Invalid entry, please try again");
            checkDouble();
        }
        if(isNumeric(entryStr)) entryNum=Double.parseDouble(entryStr);
        scn.close();
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
        Scanner scn= new Scanner(System.in);
        entryStr=scn.nextLine();
        if(entryStr!=null) {
            if(!entryStr.isEmpty()){
                if(!entryStr.startsWith(" ")){
                    return entryStr;
                } else {
                    System.out.println("Please enter a value");
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
        scn.close();
        return entryStr;
    }

    public Material enumValidationMaterial(){
        Scanner scn = new Scanner(System.in);
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