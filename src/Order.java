public class Order {

    private int tableNumber;
    private Cake[] cakeArray = new Cake[10];
    private Coffee[] coffeeArray = new Coffee[10];

    public Order(int tableNumber) {
        if(tableNumber < 1)
        {
            System.out.println("table number needs to be higher than 0");
        }else
        {
        this.tableNumber = tableNumber;
        }
    }
}
