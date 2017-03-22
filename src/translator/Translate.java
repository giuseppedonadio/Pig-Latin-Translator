package translator;

public class Translate {
	
	//instance variables
		private String phr;
		private String[] phrase;

		//methods
		public String getPhr() {
			return phr;
		}

		public void setPhr(String phr) {
			this.phr = phr;
		}
		
		public String[] getPhrase() {
			phrase = phr.split(" ");
			return phrase;
		}
		
		public void setPhrase(String[] phrase) {
			this.phrase = phrase;
		}
		
		//custom constructor 
		public Translate(String phr, String[] phrase) {
			this.phr = phr;
			this.phrase = phrase;
		}
		
		//translate
		public String setWords() {
			String wrd = "";
			for(String word : getPhrase()) {
				word = word.toLowerCase();
				
				StringBuilder w = new StringBuilder();
				
				if(word.charAt(0) != 'a' && word.charAt(0) != 'e' && word.charAt(0) != 'i' && word.charAt(0) != 'o' && word.charAt(0) != 'u' || word.charAt(0) == 'y'  ) {									
					
					w.append(word);
					w.deleteCharAt(0);
					w.append(word.charAt(0));
					
					if(word.charAt(1) != 'y' && word.charAt(1) != 'a' && word.charAt(1) != 'e' && word.charAt(1) != 'i' && word.charAt(1) != 'o' && word.charAt(1) != 'u' ) {
						
						w.deleteCharAt(0);
						w.append(word.charAt(1));
					}
					
					w.append("ay ");
								
				}else{
					
					w.append(word);
					w.append("way ");
					
				}
				wrd += w.toString();
			}
			return wrd;	
		}

}
