public class UniqueOutOfOddUsingBitwiseOperators {
    public static void main(String[] args) {

        int[] arr = {2,2,3,2,7,7,8,7,8,8};
        System.out.println("The unique number is: " + findUniqueNo(arr));
    }

    private static int findUniqueNo(int[] arr) {
        int result = 0;

        //for checking every bit and not left with any no. outer loop checks for each individual bit
        for(int bit =0; bit< 32;bit++){
            int count=0;
            for(int n:arr){
                if((n & (1<<bit)) !=0){//this checks weather that particular bit being running in the outer loop is a set bit or not
                    count++;//if set bit then ++
                }
            }
            if(count%3 !=0){//modulus to the number of duplicates remains us with the remaining solution bits
                result= result|(1<<bit);//solution bits
            }
        }

        return result;
    }
}
