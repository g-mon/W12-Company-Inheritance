public class FracItem extends Item{
    private String unitType;
    private double unitSize;
    private double pricePerUnit;
    
    public FracItem(String n, double v, int r,String uT,double pPU, double uS){
        super(n,v,r);
        pricePerUnit=pPU;
        unitType=uT;
        pricePerUnit=pPU;
        unitSize=uS;
    }
    
    public void print(){
        super.print();
        double ppuAfterTax = pricePerUnit*(1+VAT);
        System.out.println("The price is £" + ppuAfterTax+ " per " + unitSize + unitType);
    }
}
    