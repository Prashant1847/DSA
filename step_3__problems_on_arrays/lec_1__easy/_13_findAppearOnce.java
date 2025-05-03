
public class _13_findAppearOnce{

    static int find(int arr[]){
        int xor = 0;
        for(int i=0; i<arr.length; i++){
            xor = xor  ^ arr[i];
        }
        return xor;
    }
    public static void main(String args[]){
        int arr[] = {1,1,2,3,4,4,3};

        System.out.println("Number that appears once in array is -> " + find(arr));
    }
}