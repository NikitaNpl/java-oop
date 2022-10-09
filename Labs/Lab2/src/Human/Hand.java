package Human;

enum TypeHand { LEFT, RIGHT }

public class Hand {
    private TypeHand type;
    private int fingers = 5;

    public Hand(TypeHand type, int fingers) {
        this.type = type;
        this.fingers = fingers;
    }

    public Hand(TypeHand type) {
        this.type = type;
    }

    public TypeHand getType() {
        return type;
    }

    public int getFingers() {
        return fingers;
    }

    @Override
    public String toString() {
        return "Hand{" +
                "type=" + type +
                ", fingers=" + fingers +
                '}';
    }
}
