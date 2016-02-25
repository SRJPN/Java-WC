import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by soorajp on 25/02/16.
 */

public class FileContentPairTest {
    @Test
    public void charCount_gives_the_number_of_characters_in_the_content_given(){
        String testSample = "Hooooo... &^*%$#@!! It's all bad words)";
        String fileName = "sample.txt";
        FileContentPair sample = new FileContentPair(fileName, testSample);
        assertEquals(sample.charCount(),39);
    }

    @Test
    public void charCount_gives_zero_for_empty_content_given(){
        String testSample = "";
        String fileName = "sample.txt";
        FileContentPair sample = new FileContentPair(fileName, testSample);
        assertEquals(sample.charCount(),0);
    }

    @Test
    public void charCount_takes_end_of_line_slash_n_as_a_single_byte(){
        String testSample = "\n";
        String fileName = "sample.txt";
        FileContentPair sample = new FileContentPair(fileName, testSample);
        assertEquals(sample.charCount(),1);
    }

    @Test
    public void charCount_gives_the_number_of_characters_in_the_content_given_for_special_characters(){
        String testSample = "汉语/漢語";
        String fileName = "sample.txt";
        FileContentPair sample = new FileContentPair(fileName, testSample);
        assertEquals(sample.charCount(),5);
    }

    @Test
    public void lineCount_gives_count_of_line_in_the_given_content(){
        String testSample = "FileContentPairsree is a good girl.\nShe is a budduse.\nShe is even stupid sometimes.";
        String fileName = "sample.txt";
        FileContentPair sample = new FileContentPair(fileName, testSample);
        assertEquals(sample.lineCount(),2);
    }

    @Test
    public void lineCount_gives_zero_line_for_empty_string(){
        String testSample = "";
        String fileName = "sample.txt";
        FileContentPair sample = new FileContentPair(fileName, testSample);
        assertEquals(sample.lineCount(),0);
    }

    @Test
    public void wordCount_gives_zero_if_empty_string_is_given(){
        String testSample = "";
        String fileName = "sample.txt";
        FileContentPair sample = new FileContentPair(fileName, testSample);
        assertEquals(sample.wordCount(),0);
    }

    @Test
    public void wordCount_gives_the_count_of_words_in_the_given_content_with_single_line(){
        String testSample = "FileContentPairsree is a good girl";
        String fileName = "sample.txt";
        FileContentPair sample = new FileContentPair(fileName, testSample);
        assertEquals(sample.wordCount(),5);
    }

    @Test
    public void wordCount_gives_the_count_of_words_in_the_given_content_with_multiple_line(){
        String testSample = "FileContentPairsree is a good girl.\nShe is a budduse.\nShe is even stupid sometimes.";
        String fileName = "sample.txt";
        FileContentPair sample = new FileContentPair(fileName, testSample);
        assertEquals(sample.wordCount(),14);
    }


    @Test
    public void byteCount_gives_the_number_of_bytes_in_the_content_given(){
        String testSample = "Hooooo... &^*%$#@!! It's all bad words)";
        String fileName = "sample.txt";
        FileContentPair sample = new FileContentPair(fileName, testSample);
        assertEquals(sample.byteCount(),39);
    }

    @Test
    public void byteCount_gives_zero_for_empty_content_given(){
        String testSample = "";
        String fileName = "sample.txt";
        FileContentPair sample = new FileContentPair(fileName, testSample);
        assertEquals(sample.byteCount(),0);
    }

    @Test
    public void byteCount_takes_end_of_line_slash_n_as_a_single_byte(){
        String testSample = "\n";
        String fileName = "sample.txt";
        FileContentPair sample = new FileContentPair(fileName, testSample);
        assertEquals(sample.byteCount(),1);
    }

    @Test
    public void byteCount_gives_the_number_of_bytes_in_the_content_given_for_special_characters(){
        String testSample = "汉语/漢語";
        String fileName = "sample.txt";
        FileContentPair sample = new FileContentPair(fileName, testSample);
        assertEquals(sample.byteCount(),13);
    }

    @Test
    public void getFile_gives_the_file_name(){
        String testSample = "汉语/漢語";
        String fileName = "sample.txt";
        FileContentPair sample = new FileContentPair(fileName, testSample);
        assertEquals(sample.getFile(),"sample.txt");
    }
}