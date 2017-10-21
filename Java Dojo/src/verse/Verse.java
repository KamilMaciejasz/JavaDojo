package verse;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.out;

public class Verse {
    private String[] lines;

    public Verse() {
        lines = new String[5];
        Arrays.fill(lines, "");
    }

    public String getLine(int lineIndex) {
        return lines[lineIndex];
    }

    public void setLine(String line, int lineIndex) {
        lines[lineIndex] = line;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Verse verse = new Verse();
        int number;
        out.println("Which line to update? (-1 to quit)");
        number = in.nextInt();
        while (number != -1) {
            out.print("Type the new one in: ");
            in.nextLine();
            String line = in.nextLine();
            for (int i = 0; i < 5; i++) {
                if (i == number) {
                    verse.setLine(line, number);

                }
                out.println("> " + verse.getLine(i));
            }
            out.println("Which line to update? (-1 to quit)");
            number = in.nextInt();
        }
    }


}
