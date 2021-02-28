package activity;

public class SquareMatrix {

    //TODO: Update Class
    private int[][] matrix;
    private int size;

    public SquareMatrix(int size) {
        this.matrix = new int[size][size];
    }

    public SquareMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public SquareMatrix add(SquareMatrix other) {
        int[][] result = other.matrix;
        for(int i = 0; i < result.length; i++) {
            for(int j = 0; j < result[i].length; j++) {
                result[i][j] += this.matrix[i][j];
            }
        }
        return new SquareMatrix(result);
    }

    public boolean equals(Object obj) {
        SquareMatrix copy = (SquareMatrix) obj;
        int[][] other = copy.matrix;
        for(int i = 0; i < other.length; i++) {
            for (int j = 0; j < other[i].length; j++) {
                if (matrix[i][j] != other[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isDiagonal() {
        return matrix[0][0] == matrix[1][1] && matrix[1][1] == matrix[2][2];
    }

    public boolean isIdentity() {
        return matrix[0][0] == 1 && matrix[1][1] == 1 && matrix[2][2] == 1;
    }

    public SquareMatrix multiply(SquareMatrix other) {
        int[][] result = other.matrix;
        for(int i = 0; i < result.length; i++) {
            for(int j = 0; j < result[i].length; j++) {
                result[i][j] *= this.matrix[i][j];
            }
        }
        return new SquareMatrix(result);
    }

    public SquareMatrix subtract(SquareMatrix other) {
        int[][] result = other.matrix;
        for(int i = 0; i < result.length; i++) {
            for(int j = 0; j < result[i].length; j++) {
                result[i][j] = this.matrix[i][j] - result[i][j];
            }
        }
        return new SquareMatrix(result);
    }


    public String toString() {
        StringBuilder result = new StringBuilder("\n");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                result.append(matrix[i][j]).append("\t");
            }
            result.append("\n");
        }
        return result.toString();
    }
}
