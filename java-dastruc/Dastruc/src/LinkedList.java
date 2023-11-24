public class LinkedList {
    Node head;
    private int count = 0;
    void Display(){
        System.out.println("Current Nodes:");

        Node traverse = head;

        while(traverse != null){
            System.out.print(traverse.data+" -> ");
            traverse=traverse.next;
        }
        System.out.println();
    }

    void AddData(int data){
        Node newNode = new Node(data);

        if(head == null){
            newNode.next = head;
            head = newNode;
        }
        else{
            Node getLast = head;

            while(getLast.next != null){
                getLast = getLast.next;
            }

            getLast.next = newNode;
        }
        this.count++;
    }

    void DelDupe(){
        int[] arr = new int[count];
        int x = 0;

        Node traverse = head;
        Node del = null;
        Node newNext = null;
        //System.out.println("dfsdfsdfsdfsdv");
        while(traverse != null){
            Node prev = head;
            boolean duped = false;

            //System.out.println(x+" loop data:"+traverse.data);
            for(int i=0; i<count;i++){
                if(traverse.data== arr[i]){
                    //System.out.println("duped not added on array");
                    duped = true;
                    break;
                }
            }
            if(!duped){
                //System.out.println("idasok sa array:"+traverse.data);
                arr[x] = traverse.data;
            }
            else{
                for(int i=1;i<x;i++){
                    //System.out.println("aim:"+i);
                    prev = prev.next;
                    //System.out.println("prev:"+prev.data);
                }

                del = prev.next;
                newNext = del.next;
                prev.next = newNext;
                count--;
                x--;
            }
            traverse = traverse.next;
            //display();
            x++;
        }
    }

    void MidNode(){

    }
}
