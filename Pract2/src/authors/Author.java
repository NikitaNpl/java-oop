package authors;

public class Author {
    private String name;
    private String email;
    private Genders gender;

    public Author(String name, String email, char gender) throws IllegalAccessException {
        this.name = name;
        this.email = email;
        this.gender = Genders.valueOf(gender);
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Genders getGender() {
        return gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        final String appeal = this.gender == Genders.MALE ? "m" : "ms";
        return this.name + "(" + appeal + ") at " + this.email;
    }
}
