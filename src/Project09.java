/*
A Pythagorean triplet is a set of three natural numbers, a>b>c, for which,
                a^2 + b^2 = c^2
There exists exactly one Pythagorean triplet for which a+b+c = 1000.
Find the product abc.
*/

public class Project09 {
    public static void main(String[] args) throws Exception {
        
        int product = 0;
        for(int a = 1; a<999; a++) {
            for(int b = 1; b<999; b++) {
                for(int c = 1; c<999; c++) {
                    if(Math.pow(a,2) + Math.pow(b,2) == Math.pow(c, 2) && a+b+c == 1000 ){
                        product = a*b*c;
                        System.out.println("a: " + a + "b: " + b + "c: " + c);
                    }
                }    
            }    
        }
        System.out.println(product);
    }
}
