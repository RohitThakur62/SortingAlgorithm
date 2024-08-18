class MergeSort1{
    public static void Conquor(int[] a,int s,int mid,int e){//Jod
        int[] merged=new int[e-s+1];
        //size ->end-start+1 
        int index1=s;//pahla array ka starting index
        int index2=mid+1;//dusra array ka starting index;
        int x=0;//naya array ka index;
        while(index1<=mid && index2<=e){
            if(a[index1]<=a[index2]){//pahla array ka index dusra array k index se chota ho to nya array me pahla index ko add kar do
                //add karne k bad index1 ko badaho
                //nya array k index ko bhi badhao
                merged[x]=a[index1];
                index1++;
            }
            else{//dusra array ka index chota ho pahla se tab
                //nya array me dusra array ka index add ka do aur x++
                //dusra array k index ko badho index2++
                merged[x]=a[index2];
                index2++;


            }
            x++;
        }
        //agar ek me pura ho gya lekin dusra me bach gya tab
        while(index1<=mid){
            merged[x]=a[index1];
            x++;
            index1++;
        }
        while(index2<=e){
            merged[x]=a[index2];
            x++;
            index2++;
        }
        //original k under merge ko copy karo
        for(int i=0,j=s;i<merged.length;i++,j++){
            a[j]=merged[i];

        }

    }
    public static void Divide(int[] a,int s,int e){//s->starting e->ending index
        if(s>=e){
            return;
        }
        int mid=s+(e-s)/2;
        Divide(a,s,mid);//left
        Divide(a,mid+1,e);//right
        Conquor(a,s,mid,e);

    }
    public static void main(String[] args) {
        int[] a={6,3,9,5,2,8};
        int n=a.length;
        Divide(a,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(a[i]);
        }
        System.out.println();
        
    }
}