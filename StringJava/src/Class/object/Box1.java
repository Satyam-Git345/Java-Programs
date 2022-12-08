package Class.object;

public class Box1 {

    private int l, b, h;

    public Box1(int l, int b, int h) {
        this.l = l;
        this.b = b;
        this.h = h;
    }

    public Box1(int s) {
        this(s, s, s);
    }

    public Box1(Box1 b1) {
        this(b1.l, b1.b, b1.h);
    }

    public void show() {
        System.out.println(" ");
        System.out.println("Length=" + this.l);
        System.out.println("breath=" + this.b);
        System.out.println("Hight=" + this.h);
    }
}

class UseBox1 {

    public static void main(String[] args) {
        Box1 b1 = new Box1(10, 20, 30);

        Box1 b2 = new Box1(5);

        Box1 b3 = new Box1(b1);

        b1.show();
        b2.show();
        b3.show();

    }
}
