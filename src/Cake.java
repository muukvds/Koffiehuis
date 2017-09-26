public class Cake {
    private String name;
    private boolean sugarFree;

    public Cake(String name, boolean sugarFree) {
        this.name = name;
        this.sugarFree = sugarFree;
    }

    public void printCake()
    {
        if(sugarFree)
        {
            System.out.println(name +" suikervrij");
        }
        else {
            System.out.println(name);
        }

    }
}
