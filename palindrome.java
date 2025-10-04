import java.util.Scanner;

class Palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your string for palindrome check: ");
        String s = sc.nextLine();

        int i = 0;
        int j = s.length() - 1;
        boolean isPalindrome = true;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                isPalindrome = false;
                break;
            }
            i++;
            j--;
        }

        if (isPalindrome)
            System.out.println("✅ It is a palindrome!");
        else
            System.out.println("❌ Not a palindrome.");

        sc.close();
    }
}
