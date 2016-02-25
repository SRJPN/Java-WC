import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.ParseException;
import org.apache.commons.cli.UnrecognizedOptionException;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by soorajp on 25/02/16.
 */
public class CliTest {
    @Test
    public void cli_parses_the_commads_and_returns_commandLine_which_says_whether_given_command_is_present() throws ParseException{
        String[] sampleArg = {"-c"};
        Cli sample = new Cli(sampleArg);
        CommandLine cmds = sample.parse();
        assertTrue(cmds.hasOption('c'));
    }

    @Test
    public void cli_says_no_for_asked_command_is_not_present() throws ParseException{
        String[] sampleArg = {"c"};
        Cli sample = new Cli(sampleArg);
        CommandLine cmds = sample.parse();
        assertFalse(cmds.hasOption('c'));
    }

    @Test
    public void it_treats_all_the_non_commads_as_files() throws ParseException{
        String[] sampleArg = {"-c","sample.txt"};
        Cli sample = new Cli(sampleArg);
        CommandLine cmds = sample.parse();
        String[] files = {"sample.txt"};
        assertArrayEquals(files,cmds.getArgs());
    }

    @Test
    public void it_throws_exception_for_unvaild_commads() throws ParseException {
        String[] sampleArg = {"-d","sample.txt"};
        Cli sample = new Cli(sampleArg);
        try{
            CommandLine cmds = sample.parse();
        }
        catch (UnrecognizedOptionException e) {
            assertEquals(e.getMessage(), "Unrecognized option: -d");
        }
    }
}
