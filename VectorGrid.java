import sheffield.*;

public class VectorGrid {

    private int x, y;
    private Vector[][] grid;

    private static int MAX_GRID_SIZE = 50;

    public VectorGrid(int x, int y) {

        if (x > MAX_GRID_SIZE || y > MAX_GRID_SIZE)
            System.exit(1);

        this.x = x;
        this.y = y;
        this.grid = new Vector[y][x];
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public boolean set(int x, int y, Vector value) {
        int[] coord = {x, y};
        return this.set(coord, value);
    }

    public boolean set(int[] coord, Vector value) {

        if (coord[0] > this.x || coord[1] > this.y )
            return false;

        this.grid[coord[1]][coord[0]] = value;
        return true;
    }

    public Vector[][] getGrid() {
        Vector[][] copyGrid = new Vector[this.y][this.x];
        
        for (int i=0; i<this.y; i++) {
            for (int j=0; j<this.x; j++) {
                copyGrid[i][j] = this.grid[i][j];
            }
        }
        return copyGrid;
    }

    public Vector get(int x, int y) {
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
