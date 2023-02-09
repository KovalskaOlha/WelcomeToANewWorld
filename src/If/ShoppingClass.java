package If;

public class ShoppingClass {
    String item;
    double price;
    int quantity;
    ShoppingClass(String item,double price,int quantity){
        this.item=item;
        this.price=price;
        this.quantity=quantity;
    }
    void  itemTotalPrice(){
        System.out.println(item+" Total Value "+price);
    }

    public static void main(String[] args){
        ShoppingClass obj1=new ShoppingClass("Blanket",99.98,1);
        ShoppingClass obj2=new ShoppingClass("Mattress",439.18,1);
        obj1.itemTotalPrice();
        obj2.itemTotalPrice();
        System.out.println("You purchased "+(obj1.price+ obj2.price)+" today");

    }
}
