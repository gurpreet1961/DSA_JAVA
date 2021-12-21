import java.util.Scanner;

public class Railfence_Cipher {
    // static void decp(String str, int key) {

    // int diff = 2 * key - 2;
    // int inc = 0;
    // for (int i = 0; i < key; i++) {
    // int index = i;
    // int count = 0;

    // while (index < str.length()) {
    // System.out.print(str.charAt(index));
    // if (count % 2 == 0 || i == 0 || i == key - 1)
    // index += diff;
    // else {
    // index += i + inc;
    // }

    // count++;
    // }
    // }
    // }

    static void encry(String input, int key) {
        char[][] matrix = new char[key][input.length()];
        for (int i = 0; i < key; i++) {
            for (int j = 0; j < input.length(); j++) {
                matrix[i][j] = '\0';
            }
        }

        boolean goDown = false;
        int row = 0, col = 0;

        for (int i = 0; i < input.length(); i++) {
            if (row == 0 || row == key - 1) {
                goDown = !goDown;

            }
            matrix[row][col] = input.charAt(i);
            col++;
            if (goDown) {
                row++;
            } else {
                row--;
            }
        }
        for (int i = 0; i < key; i++) {
            for (int j = 0; j < input.length(); j++) {
                if (matrix[i][j] != '\0') {
                    System.out.print(matrix[i][j]);
                }
            }
        }
    }

    public static void main(String[] args) {
        // String input = "123456787";
        String input = "IAMSMARTTHANYOU";
        String decinput = "ITATHMRAUSANOMY";
        int key = 5;
        System.out.println("Input      = " + input);
        System.out.print("Encryption = ");
        encry(input, key);
        System.out.println();
        // System.out.print("decryption = ");
        // decp(decinput, key);
    }
}
