public class Prism {
    private int length;
    private int width;
    private int height;


    public Prism (int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    public Prism (int value) {
        length = value;
        width = value;
        height = value;
    }
    public Prism () {
        length = (int) (Math.random() * 91) + 10;
        width = (int) (Math.random() * 91) + 10;
        height = (int) (Math.random() * 91) + 10;
    }


    public void setLength (int length) {
        this.length = length;
    }
    public void setWidth (int width) {
        this.width = width;
    }
    public void setHeight (int height) {
        this.height = height;
    }


    public String dimensions() {
        return "Length = " + length + "\nWidth = " + width + "\nHeight = " + height;
    }


    public int volume() {
        return length * height * width;
    }


    public int surfaceArea () {
        return 2 * (length * width) + 2 * (length * height) + 2 * (width * height);
    }
}

