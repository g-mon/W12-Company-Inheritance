public class Item{
    private String name;
    protected double VAT;
    private int refID;
    private String description;
    
    public Item(String name, double vat, int ref ){
        this.name=name;
        VAT=vat;
        refID=ref;
        description="";      
    }
    
    public void print(){
        System.out.println("Name: " + name + " // Reference ID: " + refID + " // Description: " + description);
    }
    
    public double getPrice(){
        return 0;
    }
    
    public String getName(){
        return name;
    }
    
}