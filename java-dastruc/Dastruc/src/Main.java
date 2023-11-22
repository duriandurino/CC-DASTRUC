import java.util.Scanner;

public class Main{

    static Scanner sc = new Scanner(System.in);
    static LinkedList ll = new LinkedList();

    static int UserIn(){
        int loop=0;

        System.out.print("Input integer to store in Node: ");
        int input = sc.nextInt();
        ll.addData(input);

        System.out.print("Add more? Input 0 if No: ");
        loop = sc.nextInt();

        return loop;
    }

    public static void main(String[] args){
        while(UserIn()!=0){

        }
        ll.delDupe();
        ll.display();
    }
}