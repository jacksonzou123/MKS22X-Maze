import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Maze{
  public static void main(String[] args) {
    try {
      readFile("Maze.txt");
    }
    catch (FileNotFoundException e) {
      System.out.println("File not found");
    }
  }

  public static void readFile(String filename) throws FileNotFoundException{
    File text = new File("Maze.txt");
    Scanner reader = new Scanner(text);
    while (reader.hasNextLine()) {
      String line = reader.nextLine();
      System.out.println(line);
    }
  }
}
