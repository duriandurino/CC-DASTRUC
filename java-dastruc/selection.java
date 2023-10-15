public class selection {
    public static void main(String[] args){
        int[] arr = {60, 320, 7, 380, 110, 11, 10, 8};

        for(int i=0; i<arr.length-1;i++){//AHAHAHAH nakuha napud wtf #coderist
            int min = arr[i];
            int hold = 0;
            for(int j=i+1;j<arr.length;j++){
                if(min>arr[j]){
                    min=arr[j];
                    hold = j;
                }
            }
            arr[hold]=arr[i];
            arr[i]=min;

            System.out.println("\n\n"+i+"-array while sorted: ");
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
