public class Q1selection {
    public static void main(String[] args) {
        int[] arr={13,46,24,52,20,9};
        int n=arr.length;
        System.out.println("Before");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        Selection(arr,n);
    }
    public static void Selection(int[] a,int n){
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(a[j]<a[min]){
                    min=j;
                }
            }
            int t=a[min];
            a[min]=a[i];
            a[i]=t;
        }
        System.out.println("After");
        for(int i=0;i<n;i++){
            System.out.print(a[i]);
        }
        System.out.println();
    }
}
