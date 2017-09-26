public class Coffee {

    private String name;
    private int size;

    public Coffee(String name, int size) {
        this.name = name;
        this.size = size;
    }

public void printCoffee()
{
    String sizeString;

    switch (this.size)
    {
        case 1:
            sizeString = "klein";
            break;
        case 2:
            sizeString = "middel";
            break;
        case 3:
            sizeString = "groot";
            break;
            default:
                sizeString = "middel";
    }

    System.out.println(name +" "+sizeString);
}
}
