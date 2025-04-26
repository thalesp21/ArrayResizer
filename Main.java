public class Main
{
    public static void main(String[] args)
    {
        int[][] arr1 = {{2, 1, 0},
                       {1, 3, 2},
                       {0, 0, 0},
                       {4, 5, 6}};
        System.out.println(ArrayResizer.isNonZeroRow(arr1, 0));
        System.out.println(ArrayResizer.isNonZeroRow(arr1, 1));
        System.out.println(ArrayResizer.isNonZeroRow(arr1, 2));
        System.out.println(ArrayResizer.isNonZeroRow(arr1, 3));
        int[][] arr2 = {{2, 1, 0},
                        {1, 3, 2},
                        {0, 0, 0},
                        {4, 5, 6}};

        int[][] smaller = ArrayResizer.resize(arr2);
        for (int[] row:smaller) {
            for (int pos:row) System.out.print(pos+" ");
            System.out.println();
        }
    }
}