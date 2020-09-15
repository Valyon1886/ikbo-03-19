package Pack1;

public abstract class  Dog {
    public String name;
    public int age;
    public int weight;
    public Dog(String n, int a, int w){
        name=n;
        age=a;
        weight=w;
    }

    public abstract void whoisGoodBoy();
    public void voice(){
        System.out.println("BARK BARK!");
    };

}
