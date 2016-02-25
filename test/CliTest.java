import org.apache.commons.cli.ParseException;
import org.apache.commons.cli.UnrecognizedOptionException;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by soorajp on 25/02/16.
 */
public class CliTest {
    @Test
    public void it_parses_the_commads_and_says_yes_of_no_for_asked_commad_is_present_or_not() throws ParseException{
        String[] sampleArg = {"-c"};
        Cli sample = new Cli(sampleArg);
        assertTrue(sample.hasOption("c"));
    }


    @Test
    public void cli_says_no_for_asked_command_is_not_present() throws ParseException{
        String[] sampleArg = {"-c","sample.txt"};
        Cli sample = new Cli(sampleArg);
        assertFalse(sample.hasOption("w"));
    }

    @Test
    public void it_treats_all_the_non_commads_as_files() throws ParseException{
        String[] sampleArg = {"-c","sample.txt"};
        Cli sample = new Cli(sampleArg);
        String[] files = {"sample.txt"};
        assertArrayEquals(files,sample.getFiles());
    }

    @Test
    public void it_throws_exception_for_unvaild_commads() throws ParseException {
        String[] sampleArg = {"-d","sample.txt"};
        Cli sample = new Cli(sampleArg);
        try{
            sample.getFiles();
        }
        catch (UnrecognizedOptionException e) {
            assertEquals(e.getMessage(), "Unrecognized option: -d");
        }
    }

    @Test
    public void it_gives_a_string_of_all_sample() throws ParseException {
        String[] sampleArgs = {"-w","-c"};
        Cli sample = new Cli(sampleArgs);
        assertEquals("wc",sample.getOptions());
    }
}
