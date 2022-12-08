package Class.object;

class Test {

    private int x;
    private int y;
    @Override
    public String toString() {
        return "Test{" + "x=" + x + ", y=" + y + '}';
    }

    public Test(int i, int j) {
        x = i;
        y = j;
    }

    public void Increment(Test T) {
      x++;
      y++;
    }

    public void Show() {
        System.out.println("X=" + x);
        System.out.println("Y=" + y);

    }
}

class UseTest {

    public static void main(String[] args) {
        Test T = new Test(10, 20);
        T.Show();
        T.Increment(T);
        T.Show();
        
        System.out.println("In main X and Y are: ");
        System.out.println(T);
    }

}
