package Human;

public class Human {
    private Head head;
    private Hand leftHand;
    private Hand rightHand;
    private Leg leftLeg;
    private Leg rightLeg;
    private String skinColor;
    private char gender;
    private int age;

    public Human(Head head, Hand leftHand, Hand rightHand, Leg leftLeg, Leg rightLeg, String skinColor, char gender, int age) {
        this.head = head;
        this.leftHand = leftHand;
        this.rightHand = rightHand;
        this.leftLeg = leftLeg;
        this.rightLeg = rightLeg;
        this.skinColor = skinColor;
        this.gender = gender;
        this.age = age;
    }

    public Human(Head head, String skinColor, char gender, int age) {
        this.head = head;
        this.leftHand = new Hand(TypeHand.LEFT);
        this.rightHand = new Hand(TypeHand.RIGHT);
        this.leftLeg = new Leg(TypeLeg.LEFT);
        this.rightLeg = new Leg(TypeLeg.RIGHT);
        this.skinColor = skinColor;
        this.gender = gender;
        this.age = age;
    }

    public Head getHead() {
        return head;
    }

    public Hand getLeftHand() {
        return leftHand;
    }

    public Hand getRightHand() {
        return rightHand;
    }

    public Leg getLeftLeg() {
        return leftLeg;
    }

    public Leg getRightLeg() {
        return rightLeg;
    }

    public String getSkinColor() {
        return skinColor;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public void setLeftHand(Hand leftHand) {
        this.leftHand = leftHand;
    }

    public void setRightHand(Hand rightHand) {
        this.rightHand = rightHand;
    }

    public void setLeftLeg(Leg leftLeg) {
        this.leftLeg = leftLeg;
    }

    public void setRightLeg(Leg rightLeg) {
        this.rightLeg = rightLeg;
    }

    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "head=" + head +
                ", leftHand=" + leftHand +
                ", rightHand=" + rightHand +
                ", leftLeg=" + leftLeg +
                ", rightLeg=" + rightLeg +
                ", skinColor='" + skinColor + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
