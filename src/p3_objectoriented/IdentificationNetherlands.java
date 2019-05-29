package p3_objectoriented;

public class IdentificationNetherlands extends Identification {
    public IdentificationNetherlands(String number) {
        super(number);
    }

    @Override
    public boolean validate() {
        // Dutch rule says:
        // - exactly 8 characters
        // - all digits
        return getNumber().length() == 8 && getNumber().matches("[0-9]+");
    }

    @Override
    public String getIsoCode() {
        return "NL";
    }
}
