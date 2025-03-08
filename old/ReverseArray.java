public class ReverseArray {
    public static void printarr(int[] num){
        int n=num.length;
        for(int i=0;i<n;i++){
            System.out.println(num[i] + " ");
        }
        System.out.println();
    }

    public static int[] reverseArr(int [] num, int start, int end){
        while(start<end){
            int temp=num[start];
            num[start]=num[end];
            num[end]=temp;
            start++;
            end--;
        }
        return num;
    }
    public static void main(String[]args){
        int[] num={1,2,5,6,8,3,6,9,10,14};
        printarr(num);
        int[]a=reverseArr(num,0,num.length-1);
        printarr(a);
    }

}
