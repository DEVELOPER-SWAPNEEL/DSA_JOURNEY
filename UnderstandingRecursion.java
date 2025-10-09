import java.util.Scanner;

public class UnderstandingRecursion {
    //    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String x = sc.nextLine();
//       sc.nextLine();
//        message(x);
//        sc.close();
//    }
//    static void  message(String X){
//        System.out.println(X);
//        return;
//    }
    //UNDERSTANDING RECURSION USING BASE CASE AND RECURRENCE RELATION
/*
public static void main(String[] args) {

    numberRecursion(1);
}
static int numberRecursion(int x){
    if(x==6){
        return -1;
    }
    System.out.println(x);
    return numberRecursion(x+1);
    }
}
*/
    //FIBONACCI
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entre n:- ");

        int n=sc.nextInt();
        System.out.println("The "+n+"th fibonacci No. value is:- "+Fibo(n));
    }
    static int Fibo(int n){
        if(n==0){
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return Fibo(n-1)+Fibo(n-2);
    }
}