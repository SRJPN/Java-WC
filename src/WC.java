class WC {
    public static void main(String[] args) {
        WC wc =  new WC();
        Cli cli = new Cli(args);
        try {
            String[] files = cli.getFiles();
            String commands = cli.getOptions();
            String[] report = wc.processFiles(files, commands);
            for (String file : report) {
                System.out.println(file);
            }
        } catch (Exception e) {
            System.out.println(e.toString());
            cli.help();
        }
    }

    private String[] processFiles(String[] files, String options) {
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

    private String processFile(String file, String options, HandleFiles handler) {
        String content = ReadFile.addFile(file).getContent();
        FileContentPair fileContentPair = new FileContentPair(file, content);
        return handler.generateResult(fileContentPair, options);
    }
}