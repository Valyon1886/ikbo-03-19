package Pack1;

public class Galaxy implements Nameable{
    public String name;
    public String type;
    public int diametr;

    Galaxy(){
        name = "Milky Way";
        type = "Barred spiral galaxy";
        diametr = 580;

    }
    Galaxy(String name, String type, int diametr){
        this.name = name;
        this.type = type;
        this.diametr = diametr;

    }
    public String toString() {
        String inf;
        inf = "Name: "+name+" Type: "+type+" Diametr: "+diametr;
        return inf;
    }
    public String getName(){
        return name;
    }

}
