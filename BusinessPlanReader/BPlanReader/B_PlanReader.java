import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class B_PlanReader {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter name of Business plan file");
        String filename = scan.nextLine();
        read_B_plan_File(filename);
    }

    public static void read_B_plan_File(String file) throws IOException {
        String read  = Files.readString(Path.of(file));
        if (read.contains("Strategy")){
            System.out.println(read);
        }
        if (read.contains("Operations")){
            System.out.println(read);
        }
        if (read.contains("Marketing")){
            System.out.println(read);
        }
        if (read.contains("Annual")){
            System.out.println(read);
        }
        if (read.contains("Financials")){
            System.out.println(read);
        }
        if (read.contains("Outlook")){
            System.out.println(read);
        }
    }
}
