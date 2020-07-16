package Products;

public class Tree extends Product {

    double height;

    public Tree (double price, double height){
        super(price);
        this.height = height;
        type="Tree";
    }

    public double getHeight(){
        return height;
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
        toStr.append("Height: ");
        toStr.append(getHeight());
        toStr.append("\t");
        toStr.append("Price: ");
        toStr.append(getPrice());

        return toStr.toString();

    }
}
