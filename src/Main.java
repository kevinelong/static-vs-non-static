public class Main {
    public static void main(String[] args) {

        Utilities.echo("Howdy!!!");
        //NOPE Utilities.TAX_RATE = 0.9;
        System.out.println(Utilities.getRate());
        System.out.println(Utilities.add(6,7));
        System.out.println(Utilities.add(7,6));

        Toy t1 = new Toy("GI JOE");
        Toy t2 = new Toy("Barbie");
        System.out.println(t1);
        System.out.println(t2);
        t1.play();
        t2.play();
        ToyBox mine = new ToyBox();
        ToyBox yours = new ToyBox();
        mine.add(t2);
        mine.show();
        yours.add(t1);
        yours.show();
    }
}