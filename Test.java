package Pack1;

public class Test {
    public static void main(String[] args) {
        Planet Earth = new Planet("Earth", "Earth group", 6400);
        System.out.println(Earth.getName());
        Galaxy alf1 = new Galaxy("Andromeda", "nebula", 590);
        System.out.println(alf1.getName());
        Star Sirius = new Star("Sirius", "dual star", 17, 9940);
        System.out.println(Sirius.getName());

    }
}
