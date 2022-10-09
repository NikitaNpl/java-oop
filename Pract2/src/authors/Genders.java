package authors;

public enum Genders {
    MALE('M'),
    FEMALE('F'),
    UNDEFINED('U');

    public static Genders valueOf(char value) throws IllegalAccessException {
        for (final Genders gender : values()) {
            if (gender.value == value) {
                return gender;
            }
        }

        throw new IllegalAccessException("undefined value: " + value);
    }


    public final char value;

    Genders(char value) {
        this.value = value;
    }
}
