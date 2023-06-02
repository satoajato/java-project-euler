/*
A palindromic number reads the same both ways.
The largest palindrome made from the product of two 2-digit numbers is 9009 = 91x99.
Find the largest palindrome made from the product of two 3-digit numbers.
*/

public class Project04 {
    public static void main(String[] args) throws Exception {
        
        int num;
        int aux;
        int largestpalindrome = 0;
        int invertednumber = 0;
        int x = 0; 
        int y = 0;

        for (int i = 1000; i > 100; i--) {
            for (int j = 1000; j > 100; j--) {
                num = i*j;
                aux = num;
                while(aux>10) {
                    invertednumber += aux%10;
                    aux /= 10;
                    invertednumber *= 10;
                    if(aux<10) invertednumber+=aux;
                }
                // System.out.println(i + " * " + j + " = " + num + " and inverted number: " + invertednumber);
                if(num==invertednumber && largestpalindrome < num) {
                    largestpalindrome = num;
                    x = i;
                    y = j;
                }
                aux = 0;
                invertednumber = 0;
            }
        }
        System.out.println(x + " * " + y + " = " + largestpalindrome);
    }
}
