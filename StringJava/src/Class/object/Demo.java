package Class.object;

class Demo {

    public void increment(int x, int y) {
        x++;
        y++;

        System.out.println("X=" + x);
        System.out.println("Y=" + y);
    }
}

class UseDemo {

    public static void main(String[] args) {
        Demo d = new Demo();
        int x = 10, y = 20;
        System.out.println("Before increment: ");
        System.out.println("X=" + x);
        System.out.println("Y=" + y);

        d.increment(x, y);
        System.out.println("X=" + x);
        System.out.println("Y=" + y);

    }
}
