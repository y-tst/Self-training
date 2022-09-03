package interview_tasks.rotate_matrix;

public class RotateMatrixProcessor {

    public static int[][] transpondMatrix(int[][] sourceMatrix) {

        int[][] transpondMatrix = new int[sourceMatrix.length][sourceMatrix.length];

        for (int i = 0; i < sourceMatrix.length; i++) {
            for (int j = 0; j < sourceMatrix[i].length; j++) {
                transpondMatrix[j][i] = sourceMatrix[i][j];
            }
        }

        return transpondMatrix;
    }

    public static int[][] rotateMatrix(int[][] sourceMatrix) {

        int[][] transpondMatrix = new int[sourceMatrix.length][sourceMatrix.length];

        for (int i = 0; i < sourceMatrix.length; i++) {
            for (int j = 0; j < sourceMatrix[i].length; j++) {
                transpondMatrix[j][sourceMatrix[i].length -1 -i] = sourceMatrix[i][j];
            }
        }

        return transpondMatrix;
    }

    public static int[][] rotateMatrixV2(int[][] sourceMatrix) {

        int[][] rotatedMatrix = new int[sourceMatrix.length][sourceMatrix.length];
        int[][] transpondMatrix = transpondMatrix(sourceMatrix);

        for (int i = 0; i < sourceMatrix.length; i++) {
            rotatedMatrix[i] = reverse(transpondMatrix[i], transpondMatrix[i].length);
        }

        return rotatedMatrix;
    }

    public static int[][] rotateMatrix180(int[][] sourceMatrix) {
        return rotateMatrix(rotateMatrix(sourceMatrix));
    }

    static int[] reverse(int[] sourceArray, int arrayLength) {
        int[] reverserArray = new int[arrayLength];
        int j = arrayLength;
        for (int i = 0; i < arrayLength; i++) {
            reverserArray[j - 1] = sourceArray[i];
            j = j - 1;
        }

        return reverserArray;
    }
}
