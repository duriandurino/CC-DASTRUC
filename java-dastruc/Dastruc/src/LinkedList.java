public class LinkedList {
    Node head;
    private int count = 0;
    void display(){
        System.out.println("Current Nodes:");
        while(head != null){
            System.out.print(head.data+" -> ");
            head=head.next;
        }
        System.out.println();
    }

    void addData(int data){
        Node newNode = new Node(data);

        if(head == null){
            newNode.next = head;
            head = newNode;
            count++;
        }
        else{
            Node getLast = head;

            while(getLast.next != null){
                getLast = getLast.next;
            }

            getLast.next = newNode;
            count++;
        }
    }

    void delDupe(){
        int[] arr = new int[count];
        int x = 0;

        Node traverse = head;
        Node prev = null;
        System.out.println("dfsdfsdfsdfsdv");
        while(head != null){
            System.out.println("1st loop");
            for(int i=0; i<count;i++){
                if(traverse.data== arr[i]){
                    System.out.println("1st loop break");
                    break;
                }
                System.out.println("1st loop"+traverse.data);
                arr[i] = traverse.data;
            }

            for(int j = 0; j<count; j++){
                System.out.println("2nd loop");
                if(traverse.data==arr[j]&&x>0&&traverse.next!=null){
                    prev = traverse;
                    traverse = traverse.next;
                    this.count--;
                }
            }
            x++;
            prev.next = traverse.next;
        }
    }


}
