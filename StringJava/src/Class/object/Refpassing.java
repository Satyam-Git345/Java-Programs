package Class.object;

class Refpassing {

     private int l, b, h;

    public Refpassing(int l, int b, int h) {
        this.l = l;
        this.b = b;
        this.h = h;
    }

    public void IncrementByone(Refpassing s1) {
        s1.l++;
        s1.b++;
        s1.h++;
    }

    public void show() {
        System.out.println("L=" + l);
        System.out.println("B=" + b);
        System.out.println("H=" + h);
    }

}

class UseRefpassing {

    public static void main(String[] args) {
        Refpassing rf = new Refpassing(10, 20, 30);
        rf.show();
        rf.IncrementByone(rf);
        rf.show();
    }
}
