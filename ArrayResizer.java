public class ArrayResizer
{
    /** Returns true if and only if every value in row r of array2D is non-zero.
    * Precondition: r is a valid row index in array2D.
    * Postcondition: array2D is unchanged.
    */
    public static boolean isNonZeroRow(int[][] array2D, int r)
    {
        for (int j=0;j<array2D[r].length;j++) {
            if (array2D[r][j]==0) return false;
        }
        return true;
    }

    /** Returns the number of rows in array2D that contain all non-zero values.
    * Postcondition: array2D is unchanged.
    */
    public static int numNonZeroRows(int[][] array2D)
    {
        int count = 0;
        for (int i=0;i<array2D.length;i++) {
            if (isNonZeroRow(array2D, i)) count++;
        }
        return count;
    }

    /** Returns a new, possibly smaller, two-dimensional array that contains only rows
    * from array2D with no zeros, as described in part (b).
    * Precondition: array2D contains at least one column and at least one row with no zeros.
    * Postcondition: array2D is unchanged.
    */
    public static int[][] resize(int[][] array2D)
    {
        int[][] resized = new int[numNonZeroRows(array2D)][array2D[0].length];
        int u = 0;
        for (int i=0;i<array2D.length;i++) {
            if (isNonZeroRow(array2D,i)) {
                resized[u] = array2D[i];
                u++;
            }
        }
        return resized;
    }
}