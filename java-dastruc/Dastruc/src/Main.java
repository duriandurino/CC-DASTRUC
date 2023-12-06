import java.util.Scanner;

public class Main{

    static Scanner sc = new Scanner(System.in);
    static LinkedList ll = new LinkedList();

    static boolean Menu(){
        String[] actions={"Store Integers","Remove Duplicates", "Find the Middle", "Exit Program"};
        int a;
        boolean loop = true;

        for(int i=0;i<actions.length;i++){
            System.out.println("["+(i+1)+"]-"+actions[i]);
        }
        System.out.println("Choose an action:");
        a = sc.nextInt();
        switch(a){
            case 1:
                UserIn();
                ll.Display();
                break;
            case 2:
                if(ll.head!=null){
                    ll.DelDupe();
                    ll.Display();
                }else{
                    System.out.println("Nodes are empty");
                }
                break;
            case 3:
                if(ll.head!=null){
                    ll.MidNode();
                }
                break;
            case 4:
                loop = false;
                break;
            default:
                break;
        }
        return loop;
    }

    static void UserIn(){
        int loop=0;

        System.out.print("Enter desired amount of inputs: ");
        loop = sc.nextInt();

        for(int i=0;i<loop;i++){
            System.out.print("Input integer to store in Node: ");
            int input = sc.nextInt();
            ll.AddData(input);
        }
    }

    public static void main(String[] args){
        while(Menu());
    }
}