import java.util.Scanner;

public class OperasiMatrix11 {
    //input array multi dimensi
    public static int[][] inputMatrix(int rows, int cols, String name, Scanner scanner) {
        
        int[][] matrix = new int[rows][cols];
        System.out.println("Masukkan elemen " + name + " (" + rows + "x" + cols + "):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(name + "[" + (i + 1) + "][" + (j + 1) + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    public static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int rowsA = A.length, colsA = A[0].length;
        int rowsB = B.length, colsB = B[0].length;
        if (colsA != rowsB) {
            System.out.println("Perkalian tidak bisa dilakukan, jumlah kolom A harus sama dengan jumlah baris B.");
            return null;
        }
        int[][] result = new int[rowsA][colsB];
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return result;
    }

    public static int[][] transposeMatrix(int[][] A) {
        int rows = A.length, cols = A[0].length;
        int[][] transpose = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = A[i][j];
            }
        }
        return transpose;
    }

    public static void diagonals(int[][] A) {
        if (A.length != A[0].length) {
            System.out.println("Matriks bukan matriks persegi, tidak bisa menentukan diagonal utama dan samping.");
            return;
        }
        System.out.print("Diagonal Utama: ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i][i] + " ");
        }
        System.out.println();

        System.out.print("Diagonal Samping: ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i][A.length - 1 - i] + " ");
        }
        System.out.println();
    }

    public static void printMatrix(int[][] matrix) {
        if (matrix == null) return;
        for (int[] row : matrix) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris matriks A: ");
        int rowsA = scanner.nextInt();
        System.out.print("Masukkan jumlah kolom matriks A: ");
        int colsA = scanner.nextInt();
        int[][] A = inputMatrix(rowsA, colsA, "A", scanner);

        System.out.print("Masukkan jumlah baris matriks B: ");
        int rowsB = scanner.nextInt();
        System.out.print("Masukkan jumlah kolom matriks B: ");
        int colsB = scanner.nextInt();
        int[][] B = inputMatrix(rowsB, colsB, "B", scanner);

        System.out.println("\nHasil Perkalian Matriks A x B:");
        printMatrix(multiplyMatrices(A, B));

        System.out.println("\nTranspose Matriks A:");
        printMatrix(transposeMatrix(A));

        System.out.println("\nTranspose Matriks B:");
        printMatrix(transposeMatrix(B));

        System.out.println("\nDiagonal Matriks A:");
        diagonals(A);

        scanner.close();
    }
}
