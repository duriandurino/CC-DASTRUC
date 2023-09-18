class Stack{
    constructor(){
        this.items = []
        this.count = 0
    }
    //convert java
    push(element){
        this.items[this.count] = element
        console.log(`${element} is added to ${this.count}`)
        this.count += 1
        return this.count - 1
    }

    pop(){
        if(this.count == 0){
            console.log("wala sulod")
            return undefined
        }

        let deleteItem = this.items[this.count - 1]
        this.count -= 1
        console.log(`${deleteItem} is popped`)
        return deleteItem
    }

    peek(){
        console.log(`Top is ${this.items[this.count - 1]}`)
        return this.items[this.count - 1]
    }

    isEmpty(){
        console.log(this.count == 0 ? "Stack is null" : "Stack has stack/s")
        return this.count == 0
    }

    size(){
        console.log(`Stack size is ${this.count}`)
        return this.count
    }

    printStack(){
        let stackVal = ''
        for(let i = 0 ; i<this.count; i++){
            stackVal += this.items[i] + ' '
        }
        return stackVal
    }

    clear(){
        this.items = []
        this.count = 0
        console.log("yeeted Stack")
        return this.items
    }
}

const stack = new Stack()

stack.push(1115)
stack.push(143)
stack.push(2003)

console.log(stack.printStack())
stack.clear()
stack.pop()

stack.peek()

stack.size()
console.log(stack.printStack())

stack.isEmpty()

stack.pop()
stack.pop()
console.log(stack.printStack())

stack.isEmpty()