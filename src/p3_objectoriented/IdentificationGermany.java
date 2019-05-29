package p3_objectoriented;

public class IdentificationGermany extends Identification {
    public IdentificationGermany(String number) {
        super(number);
    }

    @Override
    public boolean validate() {
        // German rule says:
        // - at least 6 characters (more than 5)
        // - start with 3 uppercase letters
        // - then a dot or hyphen
        // - then one or more uppercase letters or digits
        return getNumber().length() > 5 && getNumber().matches("[A-Z]{3}[.\\-][A-Z0-9]+");
    }

    @Override
    public String getIsoCode() {
        return "DE";
    }
}
