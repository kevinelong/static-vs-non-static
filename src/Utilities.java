//Swiss army knife
public class Utilities {
    //NO SHARED DATA DECLARED AT THE CLASS LEVEL - EXCEPT CONSTANTS // never this.
    private static double PI = 3.14159;
    private static double TAX_RATE = 0.08;
    static void echo(String text){
        System.out.println(text);
    }
    static int add(int a, int b){
        return a + b;
    }
    static double getRate(){
        return TAX_RATE;
    }
}
