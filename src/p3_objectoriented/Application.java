package p3_objectoriented;

public class Application {
    public static void main(String[] args) {
        // Although identification is different for Germany and the Netherlands, we know they all extend Identification,
        // so we can assign them to Identification objects, here.
        Identification identification1 = new IdentificationGermany("ABC.203948ASFJH");
        Identification identification2 = new IdentificationGermany("XYA-LKJASD");
        Identification identification3 = new IdentificationGermany("1234567");

        Identification identification4 = new IdentificationNetherlands("12340986");
        Identification identification5 = new IdentificationNetherlands("123409");
        Identification identification6 = new IdentificationNetherlands("ASBCLKJS");

        validate(identification1);
        validate(identification2);
        validate(identification3);
        validate(identification4);
        validate(identification5);
        validate(identification6);
    }

    private static void validate(Identification identification) {
        // The argument is an Identification, and we call the validate method, although it hasn't been implemented in
        // Identification!  That doesn't matter though, since it _is_ implemented in the subclasses, so we know it's
        // safe to use.
        if (identification.validate()) {
            System.out.println(identification.getNumber() + " is valid");
        } else {
            System.out.println(identification.getNumber() + " is not valid");
        }
    }
}
