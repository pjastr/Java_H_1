public class Main {

    public static void main(String[] args) {

        Pies pies1 = new Pies();
        pies1.UstawCzasPosilku(2);

        Pies pies2 = new Pies();
        pies2.UstawCzasPosilku(7);

        WlascicielPsa Janek = new WlascicielPsa();

        System.out.println(Janek.ZabierzNaSpacer(pies1));
        System.out.println(Janek.ZabierzNaSpacer(pies2));

    }
}
