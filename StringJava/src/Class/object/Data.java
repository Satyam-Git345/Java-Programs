//Static Data Member Example:
package Class.object;

class Data {

    int a;
    static int b = 10;//(stactic member,class member,Shared Data member)
}

class UseData {

    public static void main(String[] args) {
        Data d1 = new Data();
        Data d2 = new Data();
        System.out.println("Non static Data members: ");

        d1.a = 10;
        d2.a = 20;
        System.out.println(d1.a + " " + d2.a);

        System.out.println(" ");

        Data.b = 12;

        System.out.println("static Data members: ");
        d1.b++;
        d2.b++;
        System.out.println(d1.b + " " + d2.b);

    }
}
