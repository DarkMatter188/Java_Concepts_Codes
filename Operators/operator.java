
public class operator {
    public static void main(String[] args) {
        // int n1=10;
        // int n2=20;
        // System.out.println(n1+n2);
        // System.out.println(n2/n1);
        // System.out.println(4%3);
        // System.out.println(8%12);
        int a = 5;
        int b=a++;
        // ++a;
        System.out.println(a);
        System.out.println(b);

        System.out.println("Next Case::::");
        int c=5;
        int d= --c;
        System.out.println(c);
        System.out.println(d);
        System.out.println("Nextest Case****************************");
        int n1=5;
        int n2;
        n2 = n1++ + ++n1 + n1++;
        System.out.println(n1);
        System.out.println(n2);
        int aub = 10 ^ 20;
        System.out.println(aub);
    }
}
