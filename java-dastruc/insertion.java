class insertion{
    public static void main(String[] args){
        int[] arr = {60, 320, 7, 380, 110, 11, 10, 8};

        int counter=0;
        for(int i=1; i<arr.length;i++){//AHAHAHAH wtf nakuha nako lesgo
            int tmp = arr[i];
            int count=0;
            boolean sort = false;
            //System.out.println("i before : "+arr[i]);
            for(int j=i-1;j<i&&j>=0;j--){
                counter++;
                System.out.println("Iterations: "+counter);
                //System.out.println("j before : "+arr[j]);
                if(tmp<arr[j]){
                    arr[j+1]=arr[j];
                    //System.out.println("j after : "+arr[j]);
                    sort = true;
                    count++;
                } 
            }
            if(sort==true){
                arr[i-count]=tmp;
            }
            //System.out.println("i after : "+arr[i]);
            System.out.println("\n"+i+"-array while sorted: ");
            for(int k=0; k<arr.length;k++){
                System.out.print(+arr[k]+" ");
            }
        }

        System.out.println();
        for(int i=0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}