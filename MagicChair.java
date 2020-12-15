package FacChairs;

public class MagicChair implements Chair{
    public void doMagic() {
        System.out.println("УУУУ МАГИЯ УУУУ");
    }

    @Override
    public boolean run() {
        doMagic();
        return true;
    }
}
