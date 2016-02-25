import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by soorajp on 25/02/16.
 */
public class HandleFilesTest {
    @Test
    public void it_gives_all_the_result_for_given_empty_cmds(){
        String testSample = "Anusree is a good girl.\n She is a budduse. \nShe is even stupid sometimes.";
        String fileName = "sample.txt";
        FileContentPair sample = new FileContentPair(fileName, testSample);
        assertEquals("\t2\t14\t73\tsample.txt",HandleFiles.generateResult(sample,""));
    }

    @Test
    public void it_gives_all_the_result_for_given_cmd_c(){
        String testSample = "Anusree is a good girl.\n She is a budduse. \nShe is even stupid sometimes.";
        String fileName = "sample.txt";
        FileContentPair sample = new FileContentPair(fileName, testSample);
        assertEquals("\t73\tsample.txt",HandleFiles.generateResult(sample,"c"));
    }
    @Test
    public void it_gives_all_the_result_for_given_cmd_l(){
        String testSample = "Anusree is a good girl.\n She is a budduse. \nShe is even stupid sometimes.";
        String fileName = "sample.txt";
        FileContentPair sample = new FileContentPair(fileName, testSample);
        assertEquals("\t2\tsample.txt",HandleFiles.generateResult(sample,"l"));
    }

    @Test
    public void it_gives_all_the_result_for_given_cmd_w(){
        String testSample = "Anusree is a good girl.\n She is a budduse. \nShe is even stupid sometimes.";
        String fileName = "sample.txt";
        FileContentPair sample = new FileContentPair(fileName, testSample);
        assertEquals("\t14\tsample.txt",HandleFiles.generateResult(sample,"w"));
    }

    @Test
    public void it_gives_all_the_result_for_given_cmd_wl(){
        String testSample = "Anusree is a good girl.\n She is a budduse. \nShe is even stupid sometimes.";
        String fileName = "sample.txt";
        FileContentPair sample = new FileContentPair(fileName, testSample);
        assertEquals("\t2\t14\tsample.txt",HandleFiles.generateResult(sample,"wl"));
    }
}