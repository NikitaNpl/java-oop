package Human;

public class Head {
    private int hairLength;
    private String hairColor;
    private String eyeColor;

    public Head(int hairLength, String hairColor, String eyeColor) {
        this.hairLength = hairLength;
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
    }

    public int getHairLength() {
        return hairLength;
    }

    public String getHairColor() {
        return hairColor;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setHairLength(int hairLength) {
        this.hairLength = hairLength;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    @Override
    public String toString() {
        return "Head{" +
                "hairLength=" + hairLength +
                ", hairColor='" + hairColor + '\'' +
                ", eyeColor='" + eyeColor + '\'' +
                '}';
    }
}
