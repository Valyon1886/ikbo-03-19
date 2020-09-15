package Pack1;

public class dog1 extends Dog {
    public String type;

    public dog1(String name, int age, int weight, String ty){
        super(name, age, weight);
        type=ty;
    }
    public void whoisGoodBoy() {
        System.out.println("I'm good boy!");
    }
    @Override
    public String toString() {
        return "Name: "+ name+"\nAge: "+age+"\nWeight: "+weight+"\nType: "+ type;
    }
}
