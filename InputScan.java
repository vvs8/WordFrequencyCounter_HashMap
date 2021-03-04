import java.util.*;

public class InputScan {
    Scanner scan;

    public InputScan() {
        scan = new Scanner(System.in);
    }

    public void userInput() {
        WordsCounter wcount = new WordsCounter();
        String st = "";
        System.out.println("Enter the text: -- Type * to stop");
        String textinput = scan.nextLine();
        ;
        while (!textinput.equals("*")) {
            st += textinput + " ";
            textinput = scan.nextLine();
        }
        wcount.inputScan(st);
        scan.close();
    }

}
