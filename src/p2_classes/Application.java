package p2_classes;

public class Application {
    public static void main(String[] args) {
        Tea earlGrey = new Tea("Earl Grey", 12);
        Tea greenTea = new Tea("Green Tea", 5);
        Tea rooibos = new Tea("Rooibos");

        printTea(earlGrey, greenTea, rooibos);

        printTeaNames(earlGrey, greenTea, rooibos);
    }

    private static void printTea(Tea... teas) {
        for (Tea tea : teas) {
            // Uses toString()
            System.out.println(tea);
        }
    }

    private static void printTeaNames(Tea... teas) {
        for (Tea tea : teas) {
            // Uses getter, because tea.name is private.  I.e., this doesn't work:
            // System.out.println(tea.name);
            System.out.println(tea.getName());
        }
    }
}
