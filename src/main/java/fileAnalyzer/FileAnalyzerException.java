package fileAnalyzer;

/**
 * FileAnalyzer exception class
 */
public class FileAnalyzerException extends Exception {

    /**
     * FileAnalyzerException constructor
     * @param message - error message
     * @param cause - error cause
     */
    public FileAnalyzerException(final String message, final Throwable cause) {
        super(message, cause);
    }
}
