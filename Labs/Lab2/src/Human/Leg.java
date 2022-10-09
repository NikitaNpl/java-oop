package Human;

enum TypeLeg { LEFT, RIGHT }

public class Leg {
    private TypeLeg type;
    private int fingers = 5;

    public Leg(TypeLeg type, int fingers) {
        this.type = type;
        this.fingers = fingers;
    }

    public Leg(TypeLeg type) {
        this.type = type;
    }

    public TypeLeg getType() {
        return type;
    }

    public int getFingers() {
        return fingers;
    }

    @Override
    public String toString() {
        return "Leg{" +
                "type=" + type +
                ", fingers=" + fingers +
                '}';
    }
}
