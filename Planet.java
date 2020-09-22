package Pack1;

public class Planet implements Nameable{
    public String name;
    public String type;
    public int radius;

    Planet(){
        name = "Earth";
        type = "Earth group";
        radius = 64000;
    }
    Planet(String name, String type, int radius){
        this.name = name;
        this.type = type;
        this.radius = radius;
    }
    public String toString() {
        String inf;
        inf = "Name: "+name+" Type: "+type+" Radius: "+radius;
        return inf;
    }
    public String getName(){
        return name;
    }
}
