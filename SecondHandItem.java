public class SecondHandItem extends WholItem{
    
    private int condition;
    private double adjustedPrice;
    
    public SecondHandItem(String n, double v, int r,double p,int condition){
        super(n,v,r,p);
        if(0<condition&&condition<4){
            adjustedPrice = p*(1+v)*(1-condition/10);
        }
        if(condition==4){
            adjustedPrice = p*(1+v)*(0.5);
        }
        if(condition==5){
            adjustedPrice = p*(1+v)*(0.3);
        }
        else{
            System.out.println("Condition must be between 1 and 5");
        }
    }
    
    public void print(){
        super.print();
        System.out.println("The price is £" + adjustedPrice);
    }
}
