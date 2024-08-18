import java.util.Arrays;

public class Q2Bubblesort {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        Bubblesort(a);
        System.out.println(Arrays.toString(a));
        
    }
    public static void Bubblesort(int[] a){
        boolean swap=false;
        //run the steps n-1times
        for(int i=0;i<a.length;i++){
            //for each steps ,max item will come at the last respective index
            for(int j=1;j<a.length-i;j++){
                //swap if the item is smaller than the previous
                if(a[j]<a[j-1]){
                    int temp=a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;
                    swap=true;
                }

            }
            //if you did not swap
            if(swap==false){
                break;
            }

        }
    }
}
