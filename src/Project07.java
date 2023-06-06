/*
By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
What is the 10001st prime number?
*/

public class Project07 {
    public static void main(String[] args) throws Exception {
        
        int primeCounter = 6;
        boolean isPrime = true;

        for(int i=15; primeCounter < 10001; i+=2) {
            
            for (int j = 3; j < i-1; j++) {
                if(i%j==0) {
                    isPrime = false;
                }
            }
            if(isPrime) {
                // System.out.println(i + " is prime");
                primeCounter++;
            }
            isPrime = true;

            if(primeCounter == 10001) {
                System.out.println(i);
            }
        }
    }
}
