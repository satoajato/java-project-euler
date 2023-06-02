/*
The prime factor of 13195 are 5, 7, 13 and 29.
What is the largest prime factor of the number 600851475143?
*/

public class Project03 {
    public static void main(String[] args) throws Exception {
        
        long num = 600851475143L;
        while (num%2==0) {
            num /=2;
            System.out.println(num);
        }

        for (int largest = 3; largest <= num;) {
            if(largest==num) {
                System.out.println(largest);
                break;
            }
            while(num%largest==0) {
                num /= largest;
            }
            largest++;
            for(int i=2; i<largest; i++) {
                if(largest%i==0) {
                    largest++;
                    i = 2;
                }
            }
        }

    }
}
