public class Removingeven {
    public static void printarr(int[]arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+ " " );
        }
        System.out.println();

    }


    public static int[] removeEven(int[]arr){
        int oddcount=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2 !=0){
                oddcount++;
            }
        }
        int[] Result=new int[oddcount];
        int idx=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2 !=0){
                Result[idx]=arr[i];
                idx++;
            }
        }
        return Result;
    }
    public static void main(String[] args) {
        int[] arr={1,2,4,5,6,7,8,9,10,11};
        printarr(arr);
        int[] Result= removeEven(arr);
        printarr(Result);
    }

}
