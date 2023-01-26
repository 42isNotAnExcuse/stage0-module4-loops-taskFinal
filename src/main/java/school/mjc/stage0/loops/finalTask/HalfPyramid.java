package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }

    public void printHalfPyramid(int cathetusLength) {

        int i, j, stop;
        stop = cathetusLength;

        for (i = 0; i < cathetusLength; i++) {
            for (j = 0; j < stop - 1; j++) {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {
                System.out.print("*");
            }
            stop--;
            System.out.println();
        }
    }
}

