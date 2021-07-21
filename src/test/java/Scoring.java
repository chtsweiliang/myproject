import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Scoring {

    public static void main(String[] args) {


        try {
            FileReader fileReader = new FileReader("data.txt");
            BufferedReader br = new BufferedReader(fileReader);
            String line = br.readLine();

            while (line != null) {
                String[] token = line.split(" ");
                Student stu = new Student(token[0], Integer.parseInt(token[1]), Integer.parseInt(token[2]));
                System.out.println(stu.getName() + " " + stu.getMath() + " " + stu.getEnglish() + " " + stu.getAverage() + " " + stu.getGarding());
                line = br.readLine();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
