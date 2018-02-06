import java.util.Random;

public class DiceRoll{
		public static void main(String[] args){
			Random r = new Random();
			Random r2 = new Random();
			int Low = 1;
			int High = 6;
			int Result = r.nextInt(High-Low) + Low;
			int Result2 = r2.nextInt(High-Low) + Low;
			int total = Result + Result2;
			
			System.out.println("Dice 1: " + Result);
			System.out.println("Dice 2: " +Result2);
			System.out.println("Total = " +total);
		}
}