package Products;

public class Flower extends Product {

    String colour;

    public Flower (double price, String colour){
        super(price);
        this.colour = colour;
        type="Flower";
    }

    public String getColour(){
        return colour;
    }

    @Override
    public String toString(){

        StringBuilder toStr= new StringBuilder();

        toStr.append("Product ID: ");
        toStr.append(getId());
        toStr.append("\t");
        toStr.append("Stock entry date: ");
        toStr.append(getInStockSince());
        toStr.append("\t");
        toStr.append(getType());
        toStr.append("\t");
        toStr.append("Colour: ");
        toStr.append(getColour());
        toStr.append("\t");
        toStr.append("Price: ");
        toStr.append(getPrice());

        return toStr.toString();

    }
}
