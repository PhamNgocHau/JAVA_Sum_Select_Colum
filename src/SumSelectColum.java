import java.util.Scanner;

public class SumSelectColum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a row: ");
        int row = input.nextInt();

        System.out.print("Enter a colum: ");
        int colum = input.nextInt();

        int[][] array = createArray(row, colum);
        displayArray(array);

        System.out.print("Enter colum need cal: ");
        int selected = input.nextInt();

        int result = sumSelectColum(array, selected);
        System.out.println("\n Sum a Colum in Array " + result);
    }

    public static int[][] createArray(int row, int colum) {
        int[][] array = new int[row][colum];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colum; j++) {
                array[i][j] = (int) (Math.random() * 100);
            }
        }
        return array;
    }

    public static void displayArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int sumSelectColum(int[][] arr, int numColum) {
        int total = 0;
        for (int i = 0; i < arr[numColum].length; i++) {
            total += arr[i][numColum];
        }
        return total;
    }
}
