package Controller;

import java.util.Scanner;

public class ValidEntries {

    Scanner scn= new Scanner(System.in);
    String entryStr="";
    double entryNum=0;
    public double heightTreeEntry(){
        System.out.println("To add a tree please enter its height as a numeric value");
        entryStr=scn.nextLine();
        if (!isNumeric(entryStr)) {
            System.out.println("Invalid entry");
            heightTreeEntry();
        }
        if(isNumeric(entryStr)) entryNum=Double.parseDouble(entryStr);
        return entryNum;
    }

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

    public boolean notNullString(String strNum){
        if(strNum!=null) {
            if(!strNum.isEmpty()){
                if(!strNum.startsWith(" ")){
                    System.out.println("To add a new Decorative Item  please enter either 1 or 2 to choose the material type :"+
                            "\n1: Wooden "+"n2:Plastic");
                    System.out.println("Please enter the price");
                    System.out.println("To add a flower please enter the colour");
                    return true;
                }
            }
        }
        return false;
    }






}
