// User function Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Write Code to Swap
        int t = a;
        a = b;
        b = t;

        System.out.println(a + " " + b);
    }
}
