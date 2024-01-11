import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        // String str = "string";
        // int n = 5;
		
		String repeat = str.repeat(n);
		System.out.println(repeat);
    }
}