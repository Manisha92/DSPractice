/**
 * Created by manisha on 20/2/17.
 */
public class SearchingSorting {
    public static void main(String[] args) {
        int arr[]={4,1,9,7,5};
        SearchingSorting ss=new SearchingSorting();
        //System.out.print(ss.binarySearch(arr,0,4,4));
        ss.selectionSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }


    }

    int  LinearSearch(int arr[],int N,int item){
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==item){
                return i;
            }
        }
        return -1;
    }
    int binarySearch(int arr[],int l,int r,int item){
        if(r>=l){
            int mid=l+(r-l)/2;
            if(arr[mid]==item){
                return mid;
            }
            if(arr[mid]>item){
                return binarySearch(arr,l,mid-1,item);
            }
                return binarySearch(arr,mid+1,r,item);

        }
return -1;
    }
    void selectionSort(int arr[]){
        int len=arr.length;


        for(int i=0;i<len-1;i++){
            int minIndex=i;
            for(int j=i+1;j<len;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            int temp=arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;
        }

    }
}
