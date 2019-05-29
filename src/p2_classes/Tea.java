package p2_classes;

public class Tea {
    private String name;
    int caffeine;

    public Tea(String name, int caffeine) {
        this.name = name;
        this.caffeine = caffeine;
    }

    public Tea(String name) {
        this(name, 0);
    }

    @Override
    public String toString() {
        return name + " (" + caffeine + "mg caffeine / 100ml)";
    }

    public String getName() {
        return name;
    }
}
