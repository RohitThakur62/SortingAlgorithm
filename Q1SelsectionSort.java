import java.util.Arrays;

public class Q1SelsectionSort {
    public static void main(String[] args) {
        int[] arr={4,5,1,2,3};
        Selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void Selection(int[] a){
        for(int i=0;i<a.length;i++){
            //find the max item in the remaining
            int last=a.length-i-1;
            int max_index=getMax(a,0,last);
            swap(a,max_index,last);

        }
    }
    public static int getMax(int[] arr,int s,int e){
        int max=s;
        for(int i=s;i<e;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
    public static void swap(int[] a,int f,int l){
        int temp=a[f];
        a[f]=a[l];
        a[l]=temp;
    }
    
}
