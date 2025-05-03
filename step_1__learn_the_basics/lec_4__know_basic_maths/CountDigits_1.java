package step_1__learn_the_basics.lec_4__know_basic_maths;

class Solution{
    int countDigits(int number){
        int temp = number;
        int totalDigits = 0;
        while(temp != 0){
            temp /= 10;
            totalDigits++;
        }
        System.out.println("number of digits in "+number+ " is "+totalDigits);
        return totalDigits;
    }

    int countDigits_striverMethod(int number){
        return  (int)(Math.log10(number) + 1);
    }

}


class CountDigits_1{
    public static void main(String[] args){
        Solution mySolutions = new Solution();
        mySolutions.countDigits(1234);
    }
}