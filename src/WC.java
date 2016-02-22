
class WC {
	public static void main(String[] args) {
		for(String file : args){
			ReadFile text = ReadFile.addFile(file);
			String content = text.getContent();
			Anu anu = new Anu(content);
			System.out.println("\t"+anu.lineCount()+"\t"+anu.wordCount()+"\t"+anu.byteCount()+"\t"+file);
		}	
	}
}