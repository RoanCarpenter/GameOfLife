public class GoL{

    public static void main(String args[]){
        int width = 9, length = 9;

        int[][] grid = { { 0, 1, 1, 0, 0,0,0,1,0},
        {0,0,1,0,0,0,0,0,0},
        {0,0,0,0,1,0,0,1,0},
        {0,0,0,0,1,0,0,0,0},
        {1,0,0,0,0,0,1,0,0},
        {0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,1,0,0},
        {1,0,0,0,0,1,1,0,0},
        {0,0,0,0,0,0,1,0,0},
        };

        
        for (int w=0; w<width; w++)
        {
            for (int l = 0; l< length; l++) 
            {    
                if (grid[w][l] == 0) 
                    System.out.print(".");
                else 
                    System.out.print("#");
            }
            System.out.println();
        }

        System.out.println();
        nextGeneration(grid,width,length);
    }

    static void nextGeneration(int grid [][], int width, int length) {
        int[][] future = new int[width][length];
        
            for (int l = 0; l < width; l++)
            {
                for (int w = 0; w < length; w++)
                {
                    //lines 38-43 from https://www.geeksforgeeks.org/program-for-conways-game-of-life/
                    int aliveNeighbours = 0;
                    for (int i = -1; i <= 1; i++)
                        for (int j = -1; j <= 1; j++)
                            if ((l+i>=0 && l+i<width) && (w+j>=0 && w+j<length))
                                aliveNeighbours += grid[l + i][w + j];
                    aliveNeighbours -= grid[l][w];

                    if ((grid[l][w] == 1) && (aliveNeighbours < 2))
                        future[l][w] = 0;

                    else if ((grid[l][w] == 1) && (aliveNeighbours > 3))
                        future[l][w] = 0;

                    else if ((grid[l][w] == 0) && (aliveNeighbours == 3))
                        future[l][w] = 1;

                    else
                        future[l][w] = grid[l][w];
                }
            }

        
            for (int o = 0; o < width; o++)
            {
                for (int j = 0; j < length; j++)
                {
                    if (future[o][j] == 0)
                        System.out.print(".");
                    else
                        System.out.print("#");
                }
                System.out.println();
            }
        
    }
}