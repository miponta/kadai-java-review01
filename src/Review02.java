
public class Review02 {

	public static void main(String[] args) {
		// iの値を1から100より小さい間、1ずつカウントアップして繰り返す
		for (int i = 1; i<=100; i++) {
			if(i%3 == 0 && i%5 == 0) {
			System.out.println("FizzBuzz");
		}else if (i%3 == 0){
			System.out.println("Fizz");
		}else if (i%5 == 0) {
			System.out.println("Buzz");
		}else {
			System.out.println(i);
		}

	  }
   }
}

