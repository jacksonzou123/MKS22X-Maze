import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Maze{
  public static void main(String[] args) {
    try {
      printFile("Maze.txt");
    }
    catch (FileNotFoundException e) {
      System.out.println("File not found");
    }
  }

  public static void printFile(String filename) throws FileNotFoundException{
    File text = new File("Maze.txt");
    Scanner reader = new Scanner(text);
    while (reader.hasNextLine()) {
      String line = reader.nextLine();
      System.out.println(line);
    }
  }

  public static void intoArray(String filename) throws FileNotFoundException{
    File text = new File("Maze.txt");
    Scanner reader = new Scanner(text);
    int lines = 0;
    int count = 0;
    while (reader.hasNextLine()) {
      count = reader.nextLine();
      lines++;
    }
    char[][] ary = new char[lines][count];
    reader.reset();
    int lines = 0;
    while (reader.hasNextLine()) {
      String line = reader.NextLine() 

    }
  }
}
