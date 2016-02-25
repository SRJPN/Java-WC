import org.apache.commons.cli.CommandLine;

class WC {
	public static void main(String[] args) {
		Cli cli = new Cli(args);
		CommandLine cmds;
		try{
			cmds = cli.parse();
			String[] files = cmds.getArgs();
			String[] resultEach = processFiles(files, cmds);
			for(String s : resultEach)
				System.out.println(s);
		}
		catch (Exception e){
			cli.help();
			System.exit(0);
		}
	}

	private static String[] processFiles(String[] files, CommandLine options){
		String[] result = new String[files.length];
		for(int i=0; i<files.length; i++){
			ReadFile text = ReadFile.addFile(files[i]);
			String content = text.getContent();
			Anu anu = new Anu(content);
			
			result[i] = processFile(anu, options)+" "+files[i];
		}	
		return result;
	}

	private static String processFile(Anu anu, CommandLine options){
			return "\t"+anu.lineCount()+"\t"+anu.wordCount()+"\t"+anu.charCount();
	}
}