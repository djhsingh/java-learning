package djh.learn.java;

public class TwoDArray {
    public static void main(String[] args) {

        int[][] array = new int[2][5];
        array[0][0]=5;
        array[1][2]=15;
        array[0][4]=55;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("("+array[i][j] +") ");
            }
            System.out.println("");
        }
    }
}
