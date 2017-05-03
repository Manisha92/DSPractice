/**
 * Created by manisha on 27/2/17.
 */
public class ArrayBinaryCount {

    public static void main(String[] args) {

        int arr[]={1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1};
          ArrayBinaryCount abc=new ArrayBinaryCount();
          System.out.print(abc.countMaxOnes(arr));

        }
    int countMaxOnes(int arr[]){
        int countOnes=0,maxCount=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                countOnes=0;
            }else{
                countOnes++;
                if(countOnes>maxCount){
                    maxCount=countOnes;
                }
            }
        }
        return maxCount;
    }

}
