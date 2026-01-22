public class Order {
    private int orderId ;
private Customer customer;
private double total ;

public void printOrder(){

}

    public Order(int orderId, Customer customer, double total) {
        this.orderId = orderId;
        this.customer = customer;
        this.total = total;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
