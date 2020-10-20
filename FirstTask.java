package Pack1;
import java.util.*;
import java.util.Scanner;
public class FirstTask {

    public static Stack reverse(Stack a1){
        Stack buff=new Stack();
        while(!a1.empty()){
            buff.push(a1.pop());
        }
        return buff;
    }
    public static Stack AddToEnd(Stack a1, int c){
        Stack buff=new Stack();
        buff = reverse(a1);
        buff.push(c);
        a1 = reverse(buff);
        return a1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int v1 = 0;
        int v2 = 0;
        Stack deck1 = new Stack();
        Stack deck2 = new Stack();
        Stack buff = new Stack();
        System.out.println("Введите 5 карт первого игрока: ");
        for(int i = 0; i<5;i++){
            deck1.push(sc.nextInt());
        }
        System.out.println("Введите 5 карт второго игрока: ");
        for(int i = 0; i<5;i++){
            deck2.push(sc.nextInt());
        }
        deck1 = reverse(deck1);
        deck2 = reverse(deck2);
        while((!deck1.empty())&&(!deck2.empty())&&(count<106))
        {
             v1 = (int) deck1.peek();
             v2 = (int) deck2.peek();
             if(v1==0 && v2 ==9){
                 //deck1.push(deck2.pop());
                 deck1 = AddToEnd(deck1, (int)deck1.pop());//и свои карту
                 deck1 = AddToEnd(deck1, (int)deck2.pop());
             }
             else if(v1==9 && v2 ==0){
                 //deck2.push(deck1.pop());
                 deck2 = AddToEnd(deck2, (int)deck2.pop());
                 deck2 = AddToEnd(deck2, (int)deck1.pop());
             }
             else if(v1<v2){
                 //deck1.push(deck2.pop());
                 deck2 = AddToEnd(deck2, (int)deck2.pop());
                 deck2 = AddToEnd(deck2, (int)deck1.pop());
             }
             else if(v2<v1){
                 //deck2.push(deck1.pop());
                 deck1 = AddToEnd(deck1, (int)deck1.pop());
                 deck1 = AddToEnd(deck1, (int)deck2.pop());
             }
             count++;
        }
        if(deck1.empty()){System.out.println("second "+count);}
        else if(deck2.empty()){System.out.println("first "+count);}
        else {System.out.println("botva");}
    }

}
