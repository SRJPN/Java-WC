class WC {
    public static void main(String[] args) {
        Cli cli = new Cli(args);
        try {
            String[] files = cli.getFiles();
            String cmds = cli.getOptions();
            String[] report = processFiles(files, cmds);
            for (String file : report) {
                System.out.println(file);
            }
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
            cli.help();
            System.exit(0);
        }
    }

    private static String[] processFiles(String[] files, String options) {
        int length = files.length > 1 ? files.length + 1 : files.length;
        String[] result = new String[length];
        HandleFiles handler = new HandleFiles();
        for (int i = 0; i < files.length; i++) {
            result[i] = processFile(files[i], options, handler);
        }
        if (files.length > 1)
            result[length - 1] = handler.generateTotal(options);
        return result;
    }

    private static String processFile(String file, String options, HandleFiles handler) {
        String content = ReadFile.addFile(file).getContent();
        FileContentPair fileContentPair = new FileContentPair(file, content);
        return handler.generateResult(fileContentPair, options);
    }
}