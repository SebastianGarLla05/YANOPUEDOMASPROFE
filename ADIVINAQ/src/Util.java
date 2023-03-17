import java.util.Random;

public class Util {

	private Random rand = new Random();	
	private String[] names = {"A","B","C","D","E","F","G","H","I","J","K","L"};
	private String[] atributtes = {"Funny      ","Lovely     ","Tall       ","Glasses    ","Distracted ","Angry      ","Hungry     ","Mad        "};
	private int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
	private int index = 0;
	
	public Util() {		
		ScrambleNumbers();
	}
	
	public void FillNumbers(int count) {
		numbers = new int[count];
		for(int i = 0;i<count;i++)
			numbers[i] = i;
		
		ScrambleNumbers();
	}
	
	public void ScrambleNumbers() {
		for (int i = numbers.length - 1; i > 0; i--) {
			int j = rand.nextInt(i + 1);
			int temp = numbers[i];
			numbers[i] = numbers[j];
			numbers[j] = temp;
		}
	}
	
	public String RetrieveAttribute(int i)	{
		return atributtes[i];
	}
	
	public String RetrieveName(int i) {
		return names[i];	
	}
	
	public int RetrieveNextNumber()	{
		return numbers[index++ % numbers.length];
	}	
}