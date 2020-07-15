package Products;

public class Decorative extends Product{

    Material material;


    public Decorative(double price, Material material){
        super(price);
        this.material = material;
        type="Decorative";
    }

    public Material getMaterial(){
        return material;
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
        toStr.append("Material: ");
        toStr.append(getMaterial());
        toStr.append("\t");
        toStr.append("Price: ");
        toStr.append(getPrice());

        return toStr.toString();

    }
}
