package Pack1;

public class laba10 {

    public static void main(String[] args) {
        Generic test1 = new Generic();
        test1.Test();

        GenArray<Integer> num = new GenArray<>(3);
        num.add(6);
        num.add(2);
        num.add(7);
        System.out.println(num);

        GenArray<String> str = new GenArray<>(3);
        str.add("come");
        str.add("to");
        str.add("me");
        System.out.println(str);
    }
}

