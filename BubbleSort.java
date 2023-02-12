import java.util.Arrays;

class BubbleSort{
    public static void swap(int a,int b){
            int temp=a;
            a=b;
            b=temp;
        }
    public static void bubblesort(int[] arr){
        //0 1 2 3 4

        //1 2 5 4 3


        
        for(int i=0;i<arr.length;i++){
            boolean flag=false;// to chech the stats of swap
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    flag=true;
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    
                }
            }
            
            if(flag==false){// checked if swap happened
                return;
            }
        }
        
        
    }

    public static void main(String[] args) {
        int[] arr=new int[]{1,2,5,3,6};

        bubblesort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        
    }
} 