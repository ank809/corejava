import java.util.Arrays;

public class allmissingno {
    public static void main(String[] args) {
        int [] arr= {1,2,3,4,3,4,6};
        System.out.println(Arrays.toString(sort(arr)));
    }
    static int[]   sort(int []arr){
        int []ans ={};
        int i=0;
    while(i<arr.length){
        int correct= arr[i];
        if(arr[i]<arr.length && arr[i]!=arr[correct]){
            int temp= arr[i];
            arr[i]= arr[correct];
            arr[correct]= temp;
        }

        else{
            i++;
        }
        for(int index=0; index <arr.length; index++){
            if(arr[index]!= index){
                return ans;
            }
        }
     
    }
    return ans;
    }
    
}
