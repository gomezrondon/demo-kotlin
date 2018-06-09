
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //Lambda Expressions
        try {
            Files.lines(Paths.get("C:", "temp", "MOCK_DATA.csv"))
                    .map(x -> x.toLowerCase())
                    .map(x -> x.split(","))
                    .filter(x -> x[1].startsWith("ant"))
                    .limit(5)
                    .forEach(x -> System.out.println(Arrays.toString(x))); // Very ceremonial!!!!!
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}


