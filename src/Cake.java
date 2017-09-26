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
    {
        return sugarFree;
    }
}
