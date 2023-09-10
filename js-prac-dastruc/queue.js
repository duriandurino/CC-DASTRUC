class Queue{

    constructor(){
        this.items = {}
        this.rear = 0
        this.front = 0
    }

    enqueue(element){
        this.items[this.rear] = element
        this.rear++
    }

    dequeue(){
        const deleteItem = this.items[this.front]
        delete this.items[this.front]
        console.log(`Dequeued ${deleteItem}`)
        this.front++
        return deleteItem
    }

    isEmpty(){
        return this.rear - this.front === 0
    }

    peek(){
        console.log(this.items[this.front])
        return this.items[this.front]
    }

    size(){
        let queueSize = this.rear - this.front
        console.log(`Size of queue ${queueSize}`)
        return queueSize
    }

    print(){
        console.log(this.items)
    }

}

const queue = new Queue()

queue.enqueue(15)
queue.enqueue(28)
queue.enqueue(3)

queue.peek()
queue.size()

queue.print()

queue.dequeue()

queue.peek()
queue.size()

queue.print()

