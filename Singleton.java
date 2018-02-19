//Singleton Pattern with Static getInstance class

class Atom {
    private static final Atom INSTANCE = new Atom();

    private Atom() {

    }

    public static Atom getInstance() {
        return INSTANCE;
    }

    // No need to be static
    public void info() {
        System.out.println("I'm the only instance in the universe.");
    }
}

public class Singleton {
    public static void main(String[] args) {
        Atom a = Atom.getInstance();
        a.info();
    }
}
