package fileAnalyzer;

import java.util.List;

/**
 * IFileAnalyzer implementation
 */
public class FileAnalyzer implements IFileAnalyzer {
    private String interfaceRegex;
    private String classRegex;

    /**
     * FileAnalyzer constructor
     * @param interfaceRegex - regex string to match interface classes
     * @param classRegex - regex string to match regular classes
     */
    public FileAnalyzer(final String interfaceRegex, final String classRegex) {
        this.interfaceRegex = interfaceRegex;
        this.classRegex = classRegex;
    }

    @Override
    public int countInterfaceClasses(final List<String> fileList) {
        int interfaceCount = 0;

        for(String fileName : fileList) {
            if(fileName.matches(interfaceRegex)){
                interfaceCount++;
            }
        }
        return interfaceCount;
    }

    @Override
    public int countRegularClass(List<String> fileList) {
        int regularClassesCount = 0;

        for(String fileName : fileList) {
            if(fileName.matches(classRegex)){
                regularClassesCount++;
            }
        }
        return regularClassesCount;
    }
}
