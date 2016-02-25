import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by soorajp on 25/02/16.
 */
public class HandleFilesTest {
    @Test
    public void it_gives_all_the_result_for_given_empty_cmds(){
        HandleFiles handleFiles = new HandleFiles();
        String testSample = "Anusree is a good girl.\n She is a budduse. \nShe is even stupid sometimes.";
        String fileName = "sample.txt";
        FileContentPair sample = new FileContentPair(fileName, testSample);
        assertEquals("\t2\t14\t73\tsample.txt",handleFiles.generateResult(sample,""));
    }

    @Test
    public void it_gives_all_the_result_for_given_cmd_c(){
        HandleFiles handleFiles = new HandleFiles();
        String testSample = "Anusree is a good girl.\n She is a budduse. \nShe is even stupid sometimes.";
        String fileName = "sample.txt";
        FileContentPair sample = new FileContentPair(fileName, testSample);
        assertEquals("\t73\tsample.txt",handleFiles.generateResult(sample,"c"));
    }

    @Test
    public void it_gives_all_the_result_for_given_cmd_l(){
        HandleFiles handleFiles = new HandleFiles();
        String testSample = "Anusree is a good girl.\n She is a budduse. \nShe is even stupid sometimes.";
        String fileName = "sample.txt";
        FileContentPair sample = new FileContentPair(fileName, testSample);
        assertEquals("\t2\tsample.txt",handleFiles.generateResult(sample,"l"));
    }

    @Test
    public void it_gives_all_the_result_for_given_cmd_w(){
        HandleFiles handleFiles = new HandleFiles();
        String testSample = "Anusree is a good girl.\n She is a budduse. \nShe is even stupid sometimes.";
        String fileName = "sample.txt";
        FileContentPair sample = new FileContentPair(fileName, testSample);
        assertEquals("\t14\tsample.txt",handleFiles.generateResult(sample,"w"));
    }

    @Test
    public void it_gives_all_the_result_for_given_cmd_wl(){
        HandleFiles handleFiles = new HandleFiles();
        String testSample = "Anusree is a good girl.\n She is a budduse. \nShe is even stupid sometimes.";
        String fileName = "sample.txt";
        FileContentPair sample = new FileContentPair(fileName, testSample);
        assertEquals("\t2\t14\tsample.txt",handleFiles.generateResult(sample,"wl"));
    }

    @Test
    public void it_gives_zero_for_no_files_dealt(){
        HandleFiles handleFiles = new HandleFiles();
        assertEquals("\t0\t0\t0\tTotal",handleFiles.generateTotal(""));
    }

    @Test
    public void it_gives_total_of_all_the_files_dealt(){
        HandleFiles handleFiles = new HandleFiles();
        String testSample1 = "Anusree is a good girl.\n She is a budduse. \nShe is even stupid sometimes.";
        String fileName1 = "sample.txt";
        FileContentPair sample1 = new FileContentPair(fileName1, testSample1);
        handleFiles.generateResult(sample1,"");

        String testSample2 = "Anusree is a good girl.\n She is a budduse. \nShe is even stupid sometimes.";
        String fileName2 = "sample.txt";
        FileContentPair sample2 = new FileContentPair(fileName2, testSample2);
        handleFiles.generateResult(sample2,"");

        assertEquals("\t4\t28\t146\tTotal",handleFiles.generateTotal(""));
    }
}