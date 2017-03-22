package translator;

public class TranslatorApp {

	public static void main(String[] args) {
		
		//declare variables
				String userInput = "";
				String choice = "y";
				String phr = "This program translates from english to pig latin";
				String[] phrase = {};
				
				//Welcome user
				Console.displayLine("Welcome to the Pig Latin Translator.\n");
				Console.displayLine(phr + "\n");
				
				//Create words object
				Translate words = new Translate(phr,phrase);
				
				//show translation of String phr ("This program translates from english to pig latin")
				Console.displayLine(words.setWords() + "\n");
				
				while(choice.equalsIgnoreCase("y")) {
					
					//ask user to write line that will be translated to Pig Latin
					userInput = Console.getString("Enter a line to be translated to Pig Latin: \n");
					Console.displayLine();
					
					//declare variable array
					String[] w = {};
					
					//create object
					Translate ph = new Translate(userInput,w);
					
					//show translation
					Console.displayLine(ph.setWords() + "\n");
					
					//ask user if wants to continue
					choice = Console.getString("Do you want to continue? (y/n) \n");
				}

				Console.displayLine("Bye");	

	}

}
