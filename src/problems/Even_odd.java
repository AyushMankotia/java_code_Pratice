package problems;

import java.util.Scanner;

public class Even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();

        if(n%2 == 0){
            System.out.println("given number" + n + " is even");
        }
        else{
            System.out.println("given number " + n + " is odd");
        }

    }
}
