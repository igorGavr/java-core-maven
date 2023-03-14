package lessons.lesson1.ternarka;

public class Main {
    public static void main(String[] args) {

        int x = 91;
        int y;
        y = x%2==1 ? x-10:x;
        System.out.println(y);

        final int[] ints = new int[12];
        ints[0] = 1;
        for (int i = 1; i < 12; i++) {
            ints[i] = ints[i-1]*2;
        }
        for (int i = 0; i < 12; i++) {
            System.out.println(i + " " + ints[i]);
        }

        final int[][] ints1 = new int[3][3];
        ints1[0][0] = 2;
        System.out.println(ints1.toString());

        System.out.println("****************");

        final int[][] ints2 = new int[5][];
        ints2[0] = new int[12];
        ints2[1] = new int[31];
        for (int i = 0; i < ints2.length; i++) {
            System.out.println(ints2[i]);
        }
        System.out.println("****************");

        final int[][] ints3 = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++)
                if(i==j)
                    ints3[i][j]=1;
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++)
                System.out.print(ints3[i][j]+ " ");
            System.out.println();
        }

    }
}
