//PE6
//By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
//What is the 10 001st prime number?

public class Prime2 {
   public static void main(String[] args) {
   int count = 6;
   int prime = 13;
   boolean counto = true;
   while (count != 10001) {
      counto = true;
      prime++;
      for (int i = 2; i < prime; i++) {
         if (prime % i == 0) {
            counto = false;
         }
      }
      if (counto) {
         count++;
      }
      }
         System.out.print(prime);
      }

}

         
      
             