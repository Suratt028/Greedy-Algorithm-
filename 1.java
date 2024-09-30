import java.util.Arrays;

public class TapeStorage {
    public static void main(String[] args) {
        int[] files = {12, 34, 56, 73, 24, 11, 34, 56, 78, 91, 34, 91, 45};
        Arrays.sort(files);  // เรียงไฟล์จากน้อยไปมาก
        int numTapes = 3;
        int[][] tapes = new int[numTapes][files.length / numTapes + 1];
        int[] tapeSizes = new int[numTapes]; // ขนาดของไฟล์แต่ละเทป

        // แจกจ่ายไฟล์ไปยังเทปแต่ละตัว
        for (int i = 0; i < files.length; i++) {
            tapes[i % numTapes][tapeSizes[i % numTapes]++] = files[i];
        }

        // แสดงผล
        for (int i = 0; i < numTapes; i++) {
            System.out.print("Tape " + (i + 1) + ": ");
            for (int j = 0; j < tapeSizes[i]; j++) {
                System.out.print(tapes[i][j] + " ");
            }
            System.out.println();
        }
    }
}
//
