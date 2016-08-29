import java.util.Date;
import java.util.List;

/**
 * Created by yshen on 8/28/16.
 */
public class CustomerTransaction implements Accounting, Reporting {

    private List<Product> products;

    private Customer customer;

    public CustomerTransaction (Customer customer, List<Product> products) {
        this.products = products;
        this.customer = customer;
    }

    // methods for reporting
    public String getName() {
        return customer.getName();
    }

    public Date getDate() {
        return new Date();
    }

    public String productBreakdown() {
        String reportListing = null;
        for(Product product : products) {
            reportListing +=  product.getProductName();
        }
        return reportListing;
    }

    public void prepareInvoice() {
        System.out.println("invoice prepared...");
    }

    public void chargeCustomer() {
        System.out.println("charged the customer");
    }
}
