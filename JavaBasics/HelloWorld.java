public class Array {
    public static int countOccurrences(int[] arr, int x){
        int count = 0;
        for(int i = 0; i< arr.length; i++){
            if(arr[i] == x) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,2,2,4,2,5,6};
        int x = 2;
        int result = countOccurrences(arr,x);
        System.out.println(" COUNT OF X:" + result);
        
    }
}
