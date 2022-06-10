public class Main {

    public static void main(String[] args) {
	    int A[][];
	    A = new int[5][5];

	    int B[][] = new int[5][5];

	    int [][]C = new int[5][5];

	    int[][] D = new int[5][5];

        int []E[] = new int[5][5];

	    int[] H,I,J;
	    //all H,I,J are the single dimensional array

        int[] G,F[];
        //G is a single dimensional array but F is a two dimensional array

        int R[][] = {{1,2,3}, {3,4,2},{6,7,8}};

        //displaying element of 2-D array using normal for loop
        System.out.println("Using Normal For Loop:");
        for(int i = 0; i < R.length; i++)
        {
            for(int j = 0; j < R[0].length; j++)
                System.out.print(R[i][j] + " ");
            System.out.println();
        }

        //displaying of an array using for each loop
        System.out.println("Using Normal For Each Loop:");
        for(int x[] : R)
        {
            for(int y:x)
            {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }
}
