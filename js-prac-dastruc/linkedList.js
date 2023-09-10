/*
const n1 = {
    data: 100
};

const n2 = {
    data: 200
};

n1.next = n2;

console.log(n1);
*/

class Node{
    constructor(data, next = null){
        this.data = data;
        this.next = next;
    }
}

class LinkedList{

    constructor(){
        this.head = null;
        this.size = 0;
    }

    //insert 1st node
    insertFirst (data) {
        this.head = new Node(data, this.head);
        this.size++;
    }

    //insert last node
    insertLast (data) {
        let node = new Node(data);
        let current;

        //if empty make head
        if (this.head == null) {
            this.head = node;
        } else {
            current = this.head;

            while (current.next) {
                current = current.next;
            }

            current.next = node;
        }

        this.size++;
    }

    //insert at index
    insertAt (data, index) {

        //if index is out of range
        if (index > 0 && index > this.size) {
            this.insertLast(data);//placed on last index
            return;
        }
        
        //if first index
        if (index === 0){
            this.insertFirst(data);//create new
            return;
        }

        const node = new Node(data);
        let current, previous;

        //set current to head
        current = this.head;
        let count = 0;

        while (count < index) {
            previous = current;//node before index
            count++;
            current = current.next;
        }

        node.next = current;
        previous.next = node;

        this.size++;

    }

    //get at index
    getAt (index) {
        let current = this.head;
        let count = 0;

        while (current) {
            if (count == index) {
                console.log(current.data);
            }
            count++;
            current = current.next;
        }

        return;
    }

    //remove at index
    removeAt (index) {

        if (index > 0 && index > this.size) {
            return;
        }

        let current = this.head;
        let count = 0;
        let previous;

        if (index === 0) {
            this.head = current.next;
        } else {
            while (count < index) {
                count++;
                previous = current;
                current = current.next;
            }

            previous.next = current.next;
        }

        this.size--;

    }

    //clear
    clearList(){
        this.head = null;
        this.size = 0;
    }

    //display
    printListData(){
        let current = this.head;
        let count = 1;

        while (current) {
            console.log(`${count} in list is ${current.data}`);
            current = current.next;
            count++;
        }
    }

}

const ll = new LinkedList();

ll.insertFirst(100);
ll.insertLast(300);
ll.insertAt(200, 1);

ll.clearList();

console.log(ll);

ll.removeAt(1);

ll.getAt(1);

ll.insertFirst(100);
ll.insertLast(300);
ll.insertAt(200, 1);

console.log(ll);

ll.printListData();

console.log(ll);
