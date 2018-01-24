public class WholItem extends Item{
    private double price;
    
    public WholItem(String n, double v, int r,double p){
        super(n,v,r);
        price=p;
    }
    
    public void print(){
        super.print();
        double priceAfterTax = price*(1+VAT);
        System.out.println("The price is £" + priceAfterTax);
    }
}