package p2_classes;

public class Tea {
    private String name;
    int caffeine;

    public Tea(String name, int caffeine) {
        this.name = name;
        this.caffeine = caffeine;
    }

    @Override
    public String toString() {
        return name + " (" + caffeine + "mg caffeine / 100ml)";
    }

    public String getName() {
        return name;
    }
}
