package fileManager;


import java.util.List;

/**
 * File manager interface
 */
public interface IFileManager {

    /**
     * Function contract to get all file names by folder's name
     * @param path - folder name
     * @return - file names list
     * @throws FileManagerException is thrown if:
     * <pre>
     * - unable to get file names
     * </pre>
     */
    List<String> getFolderFileNames(String path) throws FileManagerException;
}
