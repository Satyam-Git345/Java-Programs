package JavaConversion;

public class stringToLong {

    public static void main(String[] args) {
        String s = "76541715614152";

        long l = Long.parseLong(s);

        System.out.println("Long= "+l);
        
        System.out.println("S+l="+ s+l);
        
        System.out.println(l+100);
        
        
        System.out.println("");
        
        //Long to String
        long l2 = 999999999999l;
        
        String s2=String.valueOf(l2);
        System.out.println(s2);
    }

}
