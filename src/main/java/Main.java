import calculation.AbstractionMeasureCalculator;
import calculation.CalculatorException;
import calculation.IAbstractionMeasureCalculator;
import fileAnalyzer.FileAnalyzer;
import fileAnalyzer.IFileAnalyzer;
import fileManager.FileManager;
import fileManager.FileManagerException;
import fileManager.IFileManager;

import java.util.List;

/**
 * Main entry point class to the application
 */
public class Main {

    /**
     * Entry point to application
     *
     * @param args - terminal arguments
     */
    public static void main(String[] args) {
        String interfaceRegex = "^[\\w/]*/I\\w+.java$";
        String regularClassRegex = "^[\\w/]*\\w+[^Test].java$";

        IFileManager fileManager = new FileManager();
        IAbstractionMeasureCalculator abstractionCalculator = new AbstractionMeasureCalculator();
        IFileAnalyzer fileAnalyzer = new FileAnalyzer(
                interfaceRegex,
                regularClassRegex
        );
        List<String> fileNames;
        String path = "/Users/hey_gleb/Downloads/JavaCodeReporter/src";
        int countInterface;
        int countClasses;


        try {
            fileNames = fileManager.getFolderFileNames(path);

            countInterface = fileAnalyzer.countInterfaceClasses(fileNames);
            countClasses = fileAnalyzer.countRegularClass(fileNames);
            fileNames.forEach(System.out::println);
            System.out.println(countInterface);
            System.out.println(countClasses);
            System.out.println(String.format("A = %s", abstractionCalculator.calculate(countInterface, countClasses)));
        } catch (FileManagerException e) {
            System.out.println(e);
        } catch (CalculatorException e) {
            e.printStackTrace();
        }
    }
}
