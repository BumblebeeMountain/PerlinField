import sheffield.*;

public class Grid {

    private int x, y;
    private double[][] grid;

    private static int MAX_GRID_SIZE = 50;

    public Grid(int x, int y) {

        if (x > MAX_GRID_SIZE || y > MAX_GRID_SIZE)
            System.exit(1);

        this.x = x;
        this.y = y;
        this.grid = new double[y][x];
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public boolean set(int x, int y, double value) {
        int[] coord = {x, y};
        return this.set(coord, value);
    }

    public boolean set(int[] coord, double value) {

        if (coord[0] > this.x || coord[1] > this.y )
            return false;

        this.grid[coord[1]][coord[0]] = value;
        return true;
    }

    public double[][] getGrid() {
        double[][] copyGrid = new double[this.y][this.x];
        
        for (int i=0; i<this.y; i++) {
            for (int j=0; j<this.x; j++) {
                copyGrid[i][j] = this.grid[i][j];
            }
        }
        return copyGrid;
    }

    public double get(int x, int y) {
        return this.grid[y][x];
    }

    public void printGrid() {
        for (int i=0; i<this.y; i++) {
            for (int j=0; j<this.x; j++) {
                System.out.print(this.get(j, i) + " ");
            }
            System.out.println();
        }
    } 

    public static void main(String[] args) {
        ;
    }

}
