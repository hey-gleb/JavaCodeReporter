package fileManager;

/**
 * FileManager exception class
 */
public class FileManagerException extends Exception {

    /**
     * FileManagerException constructor
     * @param message - error message
     * @param cause - error cause
     */
    FileManagerException(final String message, final Throwable cause) {
        super(message, cause);
    }

}
