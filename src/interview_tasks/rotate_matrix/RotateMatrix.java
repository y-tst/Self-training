package interview_tasks.rotate_matrix;

public class RotateMatrix {

//    const matrix = [
//            [1, 2, 3],
//            [4, 5, 6],
//            [7, 8, 9]
//            ]

    public static void main(String[] args) {

        int[][] sourceMatrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Source");
        PrintIntMatrix.printIntMatrix(sourceMatrix);
        System.out.println("Transponded");
        PrintIntMatrix.printIntMatrix(RotateMatrixProcessor.transpondMatrix(sourceMatrix));
        System.out.println("Rotate 90:");
        PrintIntMatrix.printIntMatrix(RotateMatrixProcessor.rotateMatrix(sourceMatrix));
        System.out.println("Rotate 180:");
        PrintIntMatrix.printIntMatrix(RotateMatrixProcessor.rotateMatrix180(sourceMatrix));
        System.out.println("Rotate 90: v2");
        PrintIntMatrix.printIntMatrix(RotateMatrixProcessor.rotateMatrixV2(sourceMatrix));


    }



}
