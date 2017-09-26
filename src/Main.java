public class Main {

    public static void main(String[] args)
    {
        Order order = new Order(10);

        order.addCoffee("Cappuccino" ,2);
        order.addCoffee("Koffie verkeerd" ,3);
        order.addCoffee("Espresso" ,1);

        order.addCake(new Cake("Moorkop",false));
        order.addCake(new Cake("Appeltaart",true));
        order.addCake(new Cake("Appeltaart",false));

        order.showOrder();

    }
}
