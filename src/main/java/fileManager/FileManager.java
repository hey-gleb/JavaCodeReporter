package fileManager;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;

/**
 * IFileManager implementation
 */
public class FileManager implements IFileManager{

    @Override
    public List<String> getFolderFileNames(String path) throws FileManagerException {
        List<String> fileList = new LinkedList<>();

        try {
            Files.walk(Paths.get(path))
                    .filter(Files::isRegularFile)
                    .forEach(file -> fileList.add(file.toString()));

            return fileList;
        } catch (IOException e) {
            throw new FileManagerException("Unable to read files from a folder", e);
        }
    }
}
