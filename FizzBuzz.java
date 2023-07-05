public class FizzBuzz {
   public static void main (String[] args) {

     int a = Integer.parseInt(args[0]);

     for (int i = 1; i <= a; i++) {

        if (args.length == 0) {
			return;
        }    

        if ((i % 3 ==0) && (i % 5 == 0)) {
            System.out.print("FizzBuzz" + " ");

        } else if (i % 3 == 0) {
            System.out.print("Fizz" + " ");

        } else if (i % 5 == 0) {
            System.out.print("Buzz" + " ");

        } else {
            System.out.print(i + " ");
            
        }
     }
   }  
}