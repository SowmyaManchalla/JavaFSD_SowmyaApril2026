package MavenProject;

import java.nio.file.Paths;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


import org.testng.annotations.Test;

public class Test1 {
  @Test
  public void Test2() throws IOException {
	  System.out.println("Hello");
	  Path dirpath = Paths.get("Myfolder2028");
	  if(!Files.exists(dirpath))
	  {
		  Files.createDirectory(dirpath);
		  System.out.println("Directory created");
	  }
  }
}
