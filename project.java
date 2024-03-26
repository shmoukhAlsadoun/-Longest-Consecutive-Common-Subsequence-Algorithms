//the total comlixty is O(n^4) using the 'Brute-force' algorithm.
import java.util.*;
public class project {
    static int ArrayLength;
    static int n = 0;
    static int iLongestSequence = -1;
    static int jLongestSequence = -1;
//main method :
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("how many elements are you storing? ");
        ArrayLength = in.nextInt(); //gitting the length of the array from user, AKA: n
        int X[] = new int[ArrayLength];
        int Y[] = new int[ArrayLength];
        System.out.println("please enter array X elements: ");
        for (int a = 0; a < ArrayLength; a++) { //O(n)
            X[a] = in.nextInt();
        }
        System.out.println("please enter array Y elements: ");
        for (int a = 0; a < ArrayLength; a++) {//O(n)
            Y[a] = in.nextInt();
        }

        for (int k = 1; k <= ArrayLength; k++) {//O(n)
            for (int i = 0; i <= ArrayLength - k; i++) {//O(n-k)
                for (int j = 0; j <= ArrayLength - k; j++) {//O(n-k)
                    if (equal(X, Y, i, j, k)) { //O(n) -from the equal method starting at line 47-
                        iLongestSequence = i;
                        jLongestSequence = j;
                        n = k;
                    }
                }
            }
        }
        //total complixty of the 3(for loops): n*(n+1)*(n+1)*n = O(n^4)
        for (int i = iLongestSequence; i <= iLongestSequence + n - 1; i++) {//O(n)
            System.out.print(X[i] + ", ");
        }
        System.out.println();
        System.out.println("n=" + n);
        System.out.println("i=" + iLongestSequence);
        System.out.println("j=" + jLongestSequence);


    }
    ////////////////////////////////////
//equal method calculate if the two arrays sequence are longer than the old sequense and return true or false depending on it
    public static boolean equal(int x[], int[] y, int i, int j, int k) { //total complixty of the method is O(n) 
        for (int r = 1; r <= k; r++) {
            if (x[i] != y[j])
                return false;
            i++;
            j++;
        }
        return true;
    }
}