import java.util.*;

public class Guess{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int number=10;
        int f=0;
        System.out.println("Guess the number: ");
        while(f==0){
        int n=sc.nextInt();
        if(n<number){
        System.out.println("increase number");
        }
        else if(n>number){
        System.out.println("decrease number");
        }
        else if(number==n){
        System.out.println("your guess is right");
        f=1;}
        }

    }
}