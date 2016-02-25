import org.apache.commons.cli.BasicParser;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

public class Cli {
    private String[] args = null;
    private Options options = new Options();

    public Cli(String[] args) {

        this.args = args;

        options.addOption("h", "help", false, "Show help");
        options.addOption("c", "char", false, "Show Character count");
        options.addOption("l", "char", false, "Show Line count");
        options.addOption("w", "char", false, "Show Word count");
        options.addOption("a", "char", false, "Show all");
    }

    public CommandLine parse() throws ParseException {
        CommandLineParser parser = new BasicParser();
        return parser.parse(options, args);
    }

    public void help() {
        // This prints out some help
        HelpFormatter formater = new HelpFormatter();
        formater.printHelp("Wc", options);
    }
}
