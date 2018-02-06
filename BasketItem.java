public class BasketItem{
    private Item ItemType;
    private double Quantity;
    
    public BasketItem(Item item, double Quantity){
        ItemType=item;
        this.Quantity=Quantity;
    }
    
    public double Price(){
        return Quantity*ItemType.getPrice();
    }
    
    public double getQuantity(){
        return Quantity;
    }
    
    public String Name(){
        return ItemType.getName();
    }
        
}
        