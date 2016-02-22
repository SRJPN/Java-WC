
class Anu {

	String content;

	public Anu(String content){
		this.content = content;
	}
	
	public int byteCount(){
		return this.content.length();
	}

	public int lineCount(){
		int occurrences = 0;
		for(char c : this.content.toCharArray()){
		   if(c == '\n'){
		      occurrences++;
		   }
		}
		return occurrences;
	}
}