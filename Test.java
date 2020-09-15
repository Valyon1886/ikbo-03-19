package Pack1;

public class Test {
    public static void main(String[] args) {
        dog1 b1 = new dog1("Charlie", 5, 12, "Korgie");
        System.out.println(b1);
        System.out.println("\nWho is a god boy?");
        b1.whoisGoodBoy();
        System.out.println("\nSay something!");
        b1.voice();

        System.out.println("\n\n");

        dog2 b2 = new dog2("Tom", 3, 5, "Shpitz");
        System.out.println(b2);
        System.out.println("\nWho is a god boy?");
        b2.whoisGoodBoy();
        System.out.println("\nSay something!");
        b2.voice();

    }
}
