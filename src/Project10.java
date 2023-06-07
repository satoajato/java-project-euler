/*
The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
Find the sum of all the primes below two million.
*/

import java.util.ArrayList;

public class Project10 {
    public static void main(String[] args) throws Exception {

        ArrayList<Integer> primeList = new ArrayList<>();
        boolean isPrime = true;
        long sum = 2L;
        primeList.add(2);
        for(int i = 3; i<2000000; i+=2) {
            for (int j = 0; j < primeList.size(); j++) {
                if(i%primeList.get(j)==0) {
                    isPrime = false;
                    break;
                }
            }

            if(isPrime) {
                System.out.println(i);
                primeList.add(i);
                sum = (long) sum + i;
            }
            isPrime = true;
        }
        System.out.println(sum);
    }
}
