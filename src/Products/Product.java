package Products;

import java.time.LocalDate;

public abstract class Product {

    private int id;
    protected String type;
    private double price;
    private LocalDate inStockSince;
    private int idCounter =1;

    protected Product(double price){
        id= idCounter;
        this.price = price;
        inStockSince = LocalDate.now();

        idCounter++;
    }
    public int getId(){
        return id;
    }

    public double getPrice(){
        return price;
    }

    public String getType(){
        return type;
    }

    public LocalDate getInStockSince(){
        return inStockSince;
    }

    @Override
    public abstract String toString();
}
