
public class GoL{

    public static void main(String args[]){
        int M = 10;
        int N = 10;

        int grid [][] = { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 1, 1, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 1, 1, 0, 0, 0, 0, 0 },
                { 0, 0, 1, 1, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 1, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }
            };
        System.out.println("Original Life");

        for (int i=0; i<M; i++)
        {
            for (int j = 0; j < N; j++) {
                if (grid[i][j] == 0) {
                    System.out.println(".");
                }
                else {
                    System.out.println("#");
                }
            }
        }

        System.out.println();
        nextGeneration(grid[M][N]);
    }

    static void nextGeneration(int grid [][], int M, int N) {
        for(int l = 0; l <= 10; l++)
        {
            for (int w = 0; w <=10; w++)
            {
                int aliveNeighbors = 0; 
                
            }
        }
    }
}