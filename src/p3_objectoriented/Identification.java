package p3_objectoriented;

/**
 * Abstract identification class.  It's up to the implementor (subclass) to provide the logic for validate.
 */
public abstract class Identification {

    private String number;

    public Identification(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public abstract boolean validate();
}
