class HandleFiles {
    FileContentPair file;
    int totalByteCount, totalWordCount, totalLineCount;

    public HandleFiles(){
        this.totalByteCount = 0;
        this.totalLineCount = 0;
        this.totalWordCount = 0;
    }

    public String generateResult(FileContentPair file, String cmds){
        String result = "\t";
        int temp;
        if(cmds.length()==0) {
            cmds = "lwc";
        }

        if (cmds.indexOf("l")>=0){
            temp = file.lineCount();
            totalLineCount+=temp;
            result = result.concat(Integer.toString(temp)+"\t");
        }
        if (cmds.indexOf("w")>=0){
            temp = file.wordCount();
            totalWordCount+=temp;
            result = result.concat(Integer.toString(temp)+"\t");
        }
        if (cmds.indexOf("c")>=0) {
            temp = file.byteCount();
            totalByteCount += temp;
            result = result.concat(Integer.toString(temp)+"\t");
        }
        return result.concat(file.getFile());
    }

    public String generateTotal(String cmds){
        String result = "\t";
        if(cmds.length()==0) {
            cmds = "lwc";
        }
        if(cmds.indexOf("l")>=0)
            result = result.concat(Integer.toString(totalLineCount)+"\t");
        if(cmds.indexOf("w")>=0)
            result = result.concat(Integer.toString(totalWordCount)+"\t");
        if(cmds.indexOf("c")>=0)
            result = result.concat(Integer.toString(totalByteCount)+"\t");
        return result.concat("Total");
    }
}