package Pack1;

public class Star implements Nameable{
    public String name;
    public String type;
    public int radius;
    public int temperature;

    Star(){
        name = "Sun";
        type = "Yellow dwarf";
        radius = 696340;
        temperature = 5778;
    }
    Star(String name, String type, int radius, int temperature){
        this.name = name;
        this.type = type;
        this.radius = radius;
        this.temperature = temperature;
    }
    public String toString() {
        String inf;
        inf = "Name: "+name+" Type: "+type+" Radius: "+radius+" Temperature: "+temperature;
        return inf;
    }
    public String getName(){
        return name;
    }
}
