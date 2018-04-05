public class PrimeNumbers{
	public static void main(String[] args){
		int number = 2;
		while(true){
			int numberOfDivisions = 2;
			for (int j = 2; j < number; j++){
				if (number%j == 0)
					numberOfDivisions++;
			}
			if (numberOfDivisions == 2)
				System.out.println(number + " is a prime number.");
			number++;
		}
	}
}