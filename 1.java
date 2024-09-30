import java.util.Arrays;

public class TapeStorageOptimization {
    public static void main(String[] args) {
        // ไฟล์ข้อมูลที่จะจัดเก็บ
        int[] files = {12, 34, 56, 73, 24, 11, 34, 56, 78, 91, 34, 91, 45};
        Arrays.sort(files);  // เรียงไฟล์จากน้อยไปมาก
        
        // สร้างเทป 3 ตัว
        int[] tape1 = new int[files.length];
        int[] tape2 = new int[files.length];
        int[] tape3 = new int[files.length];
        
        int sizeTape1 = 0, sizeTape2 = 0, sizeTape3 = 0;
        int index1 = 0, index2 = 0, index3 = 0;

        // กระจายไฟล์แบบ Greedy
        for (int file : files) {
            if (sizeTape1 <= sizeTape2 && sizeTape1 <= sizeTape3) {
                tape1[index1++] = file;
                sizeTape1 += file;
            } else if (sizeTape2 <= sizeTape1 && sizeTape2 <= sizeTape3) {
                tape2[index2++] = file;
                sizeTape2 += file;
            } else {
                tape3[index3++] = file;
                sizeTape3 += file;
            }
        }

        // แสดงผลลัพธ์
        System.out.println("Tape 1: " + Arrays.toString(Arrays.copyOf(tape1, index1)));
        System.out.println("Tape 2: " + Arrays.toString(Arrays.copyOf(tape2, index2)));
        System.out.println("Tape 3: " + Arrays.toString(Arrays.copyOf(tape3, index3)));
    }
}
//Tape 1: [11, 34, 91]
//Tape 2: [12, 34, 78]
//Tape 3: [24, 34, 45, 56, 56, 73]
