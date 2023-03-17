import java.util.Random;
import java.util.Scanner;

public class Game {

	private Character[] characters;
	private int selectedCharacter;
	int[] atributos;
	Util u;
	Scanner scan;
	Random rand = new Random();
	
	public Game(int characters)
	{	
		u 				  = new Util();		
		atributos 		  = new int[8];
		this.characters   = new Person[characters];
		scan 			  = new Scanner(System.in);
		selectedCharacter = rand.nextInt(11);
		
		u.FillNumbers(10);
		for(int i=0;i<characters;i++) {
			this.characters[i]= new Person(u.RetrieveName(u.RetrieveNextNumber()));		
		}
		
		u.FillNumbers(8);
		for( int a = 0;a<characters; a++) {
			String str;			
			str = u.RetrieveAttribute(u.RetrieveNextNumber());
			this.characters[a].setAtributo1(str);
			CountAttributes(str.replaceAll(" ", ""));
			str = u.RetrieveAttribute(u.RetrieveNextNumber());
			this.characters[a].setAtributo2(str);
			CountAttributes(str.replaceAll(" ", ""));
			str = u.RetrieveAttribute(u.RetrieveNextNumber());
			this.characters[a].setAtributo3(str);
			CountAttributes(str.replaceAll(" ", ""));
			str = u.RetrieveAttribute(u.RetrieveNextNumber());
			this.characters[a].setAtributo4(str);
			CountAttributes(str.replaceAll(" ", ""));
			u.ScrambleNumbers();
		}
		
		System.out.println("");
		PrintAttributes();
	
		System.out.println("La maquina escogio :" +this.characters[selectedCharacter].getInfo());
	}
	
	
	private void CountAttributes(String str) {
		switch(str) {
			case "Funny":
				atributos[0]++;
				break;
			case "Lovely":
				atributos[1]++;
				break;
			case "Tall":
				atributos[2]++;
				break;
			case "Glasses":
				atributos[3]++;
				break;
			case "Distracted":
				atributos[4]++;
				break;
			case "Angry":
				atributos[5]++;
				break;
			case "Hungry":
				atributos[6]++;
				break;
			case "Mad":
				atributos[7]++;
				break;			
		}		
	}	
	
	public void PrintMenu() {
		System.out.println("");
		System.out.println("--------------------      ESCOGE UN ATRIBUTO       --------------------");
		System.out.println("");
		for(int i =0;i<10;i++)
			System.out.println(getCharacter(i));
		System.out.println("");
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("Adivina que tiene el personaje escogido... del 0 al 7");
		
		String str = scan.nextLine();
				
		for(int c =0;c<10;c++)
		{
			if(getCharacter(c).contains(str))
				System.out.println(getCharacter(c));
		}
	}
	
	public void PrintAttributes()
	{	
		for(int i = 0;i<8;i++)
			System.out.print(" "+i+"         ");
		System.out.println();
		for(int i=0;i<8;i++) {
			System.out.print(u.RetrieveAttribute(i));
		}
		System.out.println();
		for(int i = 0;i<8;i++)
			System.out.print(" "+atributos[i]+"         ");
		
		System.out.println("");
		System.out.println("");
	}
	
	public String getCharacter(int i ) {
		return characters[i].getInfo();
	}	
}
