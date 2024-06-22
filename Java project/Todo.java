import java.util.*;
import java.util.ArrayList;

public class Todo{
    public static void main(String args[]){
        int c=0;
        Scanner sc=new Scanner(System.in);
        ArrayList<String> list=new ArrayList<>();
        System.out.println("YOU CAN PERFORM 1.ADD TASKS  2.REMOVE TASKS  3.SHOW  4.DELETE  5.EXIT");
        int ch=0;
        while(ch!=5){
        System.out.println("choose anything:");
         ch=sc.nextInt();
        switch(ch){
            case 1:
            addTask(list,c);
            break;
            case 2:
            removeTask(list,c);
            break;
            case 3:
            showTask(list,c);
            break;
            case 4:
            dltTask(list,c);
            break;
            case 5:
            exitTask(list,c);
            break;
        }
    }}
    public  static void addTask(ArrayList<String> list,int c){
        Scanner sc=new Scanner(System.in);
        c++;
        System.out.println("enter new task: ");
        String str=sc.next();
        System.out.println("enter date and time to finish this task: ");
        list.add(str);
        System.out.println("your new task numbered "+c+" is added to the list");
    }
    public  static void removeTask(ArrayList<String> list,int c){
        Scanner sc=new Scanner(System.in);
        c--;
        System.out.println("enter task u wanna remove(number): ");
        int rem=sc.nextInt();
        list.remove(rem);
        System.out.println("your task is removed from  the list");
    }
    public  static void showTask(ArrayList<String> list,int c){
        System.out.println(list);
    }
    public  static void exitTask(ArrayList<String> list,int c){
        System.out.println("EXITED");
    }
    public  static void dltTask(ArrayList<String> list,int c){
        System.out.println("DELETED ALL TASKS");
        list.clear();
    }
}