public class _4_removeDuplicate {

    static int deleteDuplicates(int arr[]){
        int uniqueArr[] = new int[arr.length];
        int uniqueArrSize = 0;

        for(int i=0; i<arr.length; i++){
            boolean stored = false;

            for(int j=0; j<uniqueArrSize; j++){
                if(uniqueArr[j] == arr[i]) {
                    stored = true;
                    break;
                }
            }
            if(!stored){
                uniqueArr[uniqueArrSize++] = arr[i];
            }
        }

        for(int i=0; i<uniqueArrSize; i++){
            arr[i] = uniqueArr[i];
        }
        return uniqueArrSize;
    }


    static int removeFromSorted(int arr[]){
        int i=0;
        
        for(int j=1; j<arr.length; j++){
            if(arr[j] != arr[i]) {
                arr[++i] = arr[j];
            }
        }

        return ++i;
    }

    
    public static void main(String[] args) {
        int arr[] = {1,1, 2,2,3, 4, 5,5};
        int noOfUniqueValues = removeFromSorted(arr);
        deleteDuplicates(arr);

        for(int i=0; i<noOfUniqueValues; i++){
            System.out.print(arr[i]+", ");
        }
    }
}
