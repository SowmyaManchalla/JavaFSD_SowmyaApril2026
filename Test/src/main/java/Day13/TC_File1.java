package Day13;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.Path;
import java.io.IOException;
import java.nio.file.DirectoryStream;

public class TC_File1 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
        Path dirPath = Paths.get("Myfolder2026");
        if(!Files.exists(dirPath))
        {
        	Files.createDirectory(dirPath);
        	System.out.println("Directory created");
        }
        Path filePath = Paths.get("Myfolder2026/example.txt");
        if(!Files.exists(filePath))
        {
        	Files.createFile(filePath);
        	System.out.println("File created");
        }
        String content = "Hello this is the test file";
        Files.write(filePath,content.getBytes());
        
        System.out.println("Data written to the file");
        
        byte[] data = Files.readAllBytes(filePath);
        System.out.println("Reading from the file:"+new String(data));
        
        //copy file
        
        Path copypath = Paths.get("Myfolder2026/copy.txt");
        Files.copy(filePath,copypath, StandardCopyOption.REPLACE_EXISTING);
        System.out.println("File copied");
        
        DirectoryStream<Path> stream = Files.newDirectoryStream(dirPath);
        
        for(Path file:stream)
        {
        	System.out.println(file.getFileName());
        }
        /* boolean deleted = Files.deleteIfExists(filepath);
         * System.out.println("File is deleted");
         * boolean deleted1 = Files.deleteIfExists(copypath);
         * System.out.println("file is deleted");
         * 
         * Files.deleteifExists(dirpath);
         * System.out.println("Deleted the directory");
         */
        
        
        
        
        
	}

}
