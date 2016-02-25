import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.UnsupportedEncodingException;

class Anu {

    String content;

    public Anu(String content) {
        this.content = content;
    }

    public int charCount() {
        return this.content.length();
    }

    public int lineCount() {
        int occurrences = 0;
        for (char c : this.content.toCharArray()) {
            if (c == '\n') {
                occurrences++;
            }
        }
        return occurrences;
    }

    public int byteCount() {
        byte[] utf8Bytes = {};
        try {
            utf8Bytes = this.content.getBytes("UTF-8");
        } catch (UnsupportedEncodingException err) {
            System.out.println("ERROR.....!");
        }
        return utf8Bytes.length;
    }

    public int wordCount() {
        int occurrences = 0;
        String pattern = "\\w+";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(this.content);
        while (m.find())
            occurrences++;
        return occurrences;
    }
}