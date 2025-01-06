package src.utils;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Data {

    private final List<String> names = new ArrayList<>();

    public Data(){
        readDataFile();
    }

    public void readDataFile(){
        String dataFilePath = "resources/names.txt";
        try(Scanner scanner = new Scanner(Paths.get(dataFilePath))){
            while(scanner.hasNextLine()){
                names.add(scanner.nextLine());
            }
        }catch(IOException _){
        }
    }

    public List<String> getNames() {
        return names;
    }
}
