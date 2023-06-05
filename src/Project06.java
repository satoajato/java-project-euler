/*
The sum of the squares of the first ten natural numbers is 1^2 + 2^2 + ... + 10^2 = 385.
The square of the sum of the first ten natural numbers is (1 + 2 + ... + 10)^2 = 3025.
Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 - 385 = 2640.
Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
*/

public class Project06 {
    public static void main(String[] args) throws Exception {
        
        int sum = 0;
        int square = 0;

        for (int i = 0; i <= 100; i++) {
            sum += Math.pow(i, 2);
        }

        double aux = 0;
        for (int i = 0; i <= 100; i++) {
            aux += i;
        }
        square += Math.pow(aux, 2);
        System.out.println(square - sum);
    }
}
