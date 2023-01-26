package school.mjc.stage0.loops.finalTask;

import java.util.Scanner;

public class MultiplicationTable {
    public void printTable(int numberTableToPrint) {
        int input = numberTableToPrint;

        if (input < 0) {
            input *= -1;
        }
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n",
                    i, numberTableToPrint, input * i);
        }
    }
}
