import java.util.HashSet;
public class Basket{
    HashSet<BasketItem> InBasket = new HashSet<BasketItem>();
    
    public Basket(){
    }
    
    public void addItem(BasketItem BI){
        InBasket.add(BI);
    }
    
    public void printBasket(){
        for(BasketItem i: InBasket){
            System.out.println(i.getQuantity() + " units of " + i.Name() + " price: £"+i.Price());
        }
    }
}

          