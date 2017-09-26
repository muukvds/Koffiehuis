public class Cake {
    private String name;
    private boolean sugarFree;

    public Cake(String name, boolean sugarFree) {
        this.name = name;
        this.sugarFree = sugarFree;
    }

    public String getName() {
        return name;
    }

    public boolean isSugarFree()
    {return sugarFree;}

    public void print()
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
