public class Order {

    private int tableNumber;
    private Cake[] cakeArray = new Cake[10];
    private Coffee[] coffeeArray = new Coffee[10];

    public Order(int tableNumber) {
        if (tableNumber < 1) {
            System.out.println("table number needs to be higher than 0");
        } else {
            this.tableNumber = tableNumber;
        }
    }

    public void addCake(Cake cake) {
        for (int i = 0; i < cakeArray.length; i++) {
            if (cakeArray[i] == null) {
                cakeArray[i] = cake;
                break;
            }
        }
    }

    public void addCoffee(String name,int size) {
        for (int i = 0; i < coffeeArray.length; i++) {
            if (coffeeArray[i] == null) {
                coffeeArray[i] = new Coffee(name,size);
                break;
            }
        }
    }

    public String listSugarFreeCake()
    {
        String list="";

        for(Cake cake:cakeArray)
        {
            if(cake != null)
            {
                if(cake.isSugarFree())
                {
                    list += cake.getName() +"\n";
                }
            }
        }

        return list;
    }

    public void showOrder() {
        System.out.println("Tafelnummer: " + tableNumber);

        printCoffee();

        printCake();

    }

    private void printCoffee() {
        int coffeeCount = 0;
        for (Coffee coffee : coffeeArray
                ) {
            if (coffee != null) {
                coffee.print();
                coffeeCount++;
            }
        }

        System.out.println();
        System.out.println("Totaal: " + coffeeCount);
        System.out.println();
    }

    private void printCake() {
        int cakeCount = 0;

        for (Cake cake : cakeArray
                ) {

            if (cake != null) {
                cake.print();
                cakeCount++;
            }
        }

        System.out.println();
        System.out.println("Totaal: " + cakeCount);
        System.out.println();
    }
}
