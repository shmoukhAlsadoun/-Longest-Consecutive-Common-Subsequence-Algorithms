import java.util.*;
public class ourSegustion {
    static int ArrayLength;
    static int n = 0;
    static int nmax = -1;
    static int imax = -1;
    static int jmax = -1;
    static int j;
    static int i_start = -1;
    static int j_start = -1;

    public static void main(String[] sd) {
        Scanner in = new Scanner(System.in);
        System.out.println("how many elements are you storing? ");
        ArrayLength = in.nextInt(); // gitting the length of the array from user, AKA: n
        int X[] = new int[ArrayLength];
        int Y[] = new int[ArrayLength];
        System.out.println("please enter array X elements: ");
        for (int a = 0; a < ArrayLength; a++) { // O(n)
            X[a] = in.nextInt();
        }
        System.out.println("please enter array Y elements: ");
        for (int a = 0; a < ArrayLength; a++) {// O(n)
            Y[a] = in.nextInt();
        }

        for (int i = 0; i < ArrayLength; i++) {
            j = 0;
            while (j < ArrayLength) {
                while (i < ArrayLength && j < ArrayLength && Y[j] != X[i]) {
                    j++;
                }
                if (j < ArrayLength && i < ArrayLength && Y[j] == X[i]) {
                    n = 0;
                    i_start = i;
                    j_start = j;
                    int r = i;
                    while (j < ArrayLength && r < ArrayLength && Y[j] == X[r]) {
                        n++;
                        r++;
                        j++;
                    }
                    if (n > nmax) {
                        nmax = n;
                        imax = i_start;
                        jmax = j_start;
                    }
                }
            }
        }
        int SequenceStart = 0;
        System.out.print("the longest sequence S ={ ");
        int num = nmax;
        while (num != 0) {
            if (num - 1 == 0) {
                System.out.print(X[(imax + SequenceStart)] + " ");
            } else {
                System.out.print(X[(imax + SequenceStart)] + ", ");
            }
            SequenceStart++;
            num--;
        }
        System.out.print("}");
        System.out.println();
        System.out.println("n= " + nmax);
        System.out.println("i=" + (imax + 1));
        System.out.println("j=" + (jmax + 1));
    }
}