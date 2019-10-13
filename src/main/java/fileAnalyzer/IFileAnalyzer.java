package fileAnalyzer;

import java.util.List;

public interface IFileAnalyzer {

    int countInterfaceClasses(List<String> fileList);

    int countRegularClass(List<String> fileList);
}
