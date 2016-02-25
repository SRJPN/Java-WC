class HandleFiles {
    static FileContentPair file;
    static int totalByteCount, totalWordCount, totalLineCount;

    public static String generateResult(FileContentPair file, String cmds){
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
}