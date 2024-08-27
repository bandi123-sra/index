
HACKER RANK PRO-1

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Read the integer from input
        int n = scanner.nextInt();
        
        // Close the scanner
       
        // Apply the conditional logic
        if (n % 2 != 0) {
            // If n is odd
            System.out.println("Weird");
        } else {
            // If n is even
            if (n >= 2 && n <= 5) {
                System.out.println("Not Weird");
            } else if (n >= 6 && n <= 20) {
                System.out.println("Weird");
            } else if (n > 20) {
                System.out.println("Not Weird");
            }
        }
    }
}
 
HACKER RANK PRO-2

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);// Complete this line
        // Complete this line
    }
}

HACKER RANK PRO-3

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read integer
        int i = scanner.nextInt();
        
        // Read double
        double d = scanner.nextDouble();
        
        // Consume the remaining newline character
        scanner.nextLine();
        
        // Read string
        String s = scanner.nextLine();
        
        // Output in required format
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        
        // Close the scanner
        scanner.close();
    }
}


HACKER RANK PRO-4



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("================================");
        while(scanner.hasNext())
        {
        String word= scanner.next();
        int  number= scanner.nextInt();
        System.out.printf("%-15s%03d%n" ,word ,number);
        }
        System.out.println("================================");
        
    }
}
 //

 
HACKER RANK PRO-5


import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String A = scanner.nextLine();
        scanner.close();
        
        // Check if the string is equal to its reverse
        String reverseA = new StringBuilder(A).reverse().toString();
        
        if (A.equals(reverseA)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}



