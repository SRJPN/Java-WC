class HandleFiles {
    private int totalByteCount, totalWordCount, totalLineCount;

    public HandleFiles(){
        this.totalByteCount = 0;
        this.totalLineCount = 0;
        this.totalWordCount = 0;
    }

    public String generateResult(FileContentPair file, String commands){
        String result = "\t";
        int temp;
        if(commands.length()==0) {
            commands = "lwc";
        }

        if (commands.contains("l")){
            temp = file.lineCount();
            totalLineCount+=temp;
            result = result.concat(Integer.toString(temp)+"\t");
        }
        if (commands.contains("w")){
            temp = file.wordCount();
            totalWordCount+=temp;
            result = result.concat(Integer.toString(temp)+"\t");
        }
        if (commands.contains("c")) {
            temp = file.byteCount();
            totalByteCount += temp;
            result = result.concat(Integer.toString(temp)+"\t");
        }
        return result.concat(file.getFile());
    }

    public String generateTotal(String commands){
        String result = "\t";
        if(commands.length()==0) {
            commands = "lwc";
        }
        if(commands.contains("l"))
            result = result.concat(Integer.toString(totalLineCount)+"\t");
        if(commands.contains("w"))
            result = result.concat(Integer.toString(totalWordCount)+"\t");
        if(commands.contains("c"))
            result = result.concat(Integer.toString(totalByteCount)+"\t");
        return result.concat("Total");
    }
}