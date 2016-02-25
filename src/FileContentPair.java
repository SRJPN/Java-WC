class FileContentPair {
	private final String file;
	private final Anu content;
	
	FileContentPair(String file, String content){
		this.file = file;
		this.content = new Anu(content);
	}

    public int lineCount(){
        return this.content.lineCount();
    }

    public int charCount(){
        return this.content.charCount();
    }

    public int wordCount(){
        return this.content.wordCount();
    }

    public int byteCount(){
        return this.content.byteCount();
    }

    public String getFile(){ return this.file; }
}