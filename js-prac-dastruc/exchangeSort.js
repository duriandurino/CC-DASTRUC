function bubbleSort(array){
    let swapped
    do{
        swapped = false
        for(let i = 0; i < array.length - 1; i++){
            if(array[i] < array[i+1]){

                let tmp = array[i]

                array[i] = array[i+1]
                array[i+1] = tmp

                swapped = true
            }
        }
    }while(swapped)
}

const array = [11,15,3,9,28]

bubbleSort(array)

console.log(array)