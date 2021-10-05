
package lab1.model;

public class NoTaxProduct extends Product{

    public NoTaxProduct() {
    }

    public NoTaxProduct(String name, double price) {
        super(name, price);
    }
    
    @Override
    public double getImportTax() {
        return 0; //To change body of generated methods, choose Tools | Templates.
    }
    
}
