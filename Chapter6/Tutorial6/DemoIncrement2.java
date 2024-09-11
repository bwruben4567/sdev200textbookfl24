// Bill Ruben
// p.213
public class DemoIncrement2 {
    public static void main(String[] args) {
        int v = 4;
        int plusPlusV = ++v;
        v = 4;
        int vPlusPlus = v++;
        int value;
        value = v * 2;
        System.out.println(value);
        System.out.println("v is " + v);
        System.out.println("++v is " + plusPlusV);
        System.out.println("v++ is " + vPlusPlus);
        int w = 17, x = 17, y = 18;
        boolean compare1 = (++w == y);
        boolean compare2 = (x++ == y);
        System.out.println(x);
        System.out.println("First compare is " + compare1);
        System.out.println("Second compare is " + compare2);
    }
}
