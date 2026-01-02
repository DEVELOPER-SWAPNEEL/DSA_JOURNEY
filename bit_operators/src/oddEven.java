import java.util.Scanner;

public class oddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        Checker(n);
    }
    public static void Checker(int n){
        if((n & 1) == 0){
            System.out.println("The number you provided is even");
        }
        else System.out.println("The number you provided is odd");
    }
}
