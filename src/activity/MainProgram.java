package activity;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class MainProgram {

    public static SquareMatrix read(String location) throws IOException {
        File file      = new File(location);
        Scanner input  = new Scanner(file);
        int size       = input.nextInt();
        int[][] matrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
        input.close();
        return new SquareMatrix(matrix);
    }

    public static void write(String location, StringBuilder builder) throws IOException {
        File file           = new File(location);
        PrintWriter writer  = new PrintWriter(file);

        writer.println(builder);
        writer.close();
    }

    public static void main(String[] args) throws IOException {
        String location = "data" + File.separator + "matrix.txt";
        String otherLocation = "data" + File.separator + "other_matrix.txt";
        String copyLocation = "data" + File.separator + "matrixCopy.txt";
        String outputLocation = "data" + File.separator + "output.txt";
        StringBuilder builder = new StringBuilder("\n");
        SquareMatrix mat = read(location);
        SquareMatrix copy = read(copyLocation);
        SquareMatrix otherMat = read(otherLocation);
        System.out.println("First matrix:" + mat + "Diagonal: " + mat.isDiagonal() + "\nIdentity: " + mat.isIdentity());
        System.out.println("\nCopy matrix:" + copy);
        System.out.println("\nOther matrix:" + otherMat + "Diagonal: " + otherMat.isDiagonal() + "\nIdentity: " + otherMat.isIdentity());
        PrintStream var10000 = System.out;
        boolean var10001 = mat.equals(copy);
        var10000.println("\nMatrix and copy isEqual: " + var10001);
        var10000 = System.out;
        var10001 = mat.equals(otherMat);
        var10000.println("Matrix and other matrix isEqual: " + var10001);
        SquareMatrix temp = mat.subtract(otherMat);
        builder.append("Added result:" + temp);
        temp = mat.subtract(otherMat);
        builder.append("Subtracted result:" + temp);
        temp = mat.multiply(otherMat);
        builder.append("Multiplied result:" + temp);
        System.out.println("\nThis is builder: " + builder.toString());

        //write(outputLocation, builder);
    }
}
