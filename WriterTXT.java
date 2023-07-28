import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class WriterTXT {

   public void writeFile(String file, List<String> lines) throws IOException {

       Path filePath = Paths.get(file);

       Files.write(filePath, lines, StandardCharsets.UTF_8);
   }
}

