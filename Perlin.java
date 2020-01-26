import sheffield.*;

public class Perlin {

    public final int GRID_X = 10;
    public final int GRID_Y = 10;
    public final double VECTOR_LENGTH = 0.8;

    private final double CIRCLE_FACTOR = 1.0;

    private final int WIDTH = 1000;
    private final int HEIGHT = 1000;

    private EasyGraphics g;

    public VectorGrid vectorGrid;
    public Grid grid;

    public Perlin() {
        this.vectorGrid = new VectorGrid(GRID_X, GRID_Y);
        this.grid = new Grid(GRID_X, GRID_Y);
        this.g = new EasyGraphics(WIDTH, HEIGHT);
    }

    public static void main(String[] args) {
        Perlin perlin = new Perlin();
        perlin.noise();
        perlin.draw();
    }

    public void noise() {
        for (int i=0; i<GRID_Y; i++) {
            for (int j=0; j<GRID_X; j++) {
                double x = VECTOR_LENGTH * Math.cos( random(0, 2*Math.PI) );
                double y = VECTOR_LENGTH * Math.sin( random(0, 2*Math.PI) );
                Vector randomVector = new Vector(x, y);
                Vector positionVector = new Vector(j, i);

                vectorGrid.set(i, j, randomVector);

                double valueAtPoint = Vector.dotProduct(randomVector, positionVector);
                if (valueAtPoint < 0)
                    valueAtPoint *= -1;

                grid.set(j, i, valueAtPoint);

            }
        }

        // return 0;
    }

    public void draw() {
        // this.vectorGrid.printGrid();
        this.grid.printGrid();
    }

    private double random() {
        return this.random(0, 1);
    }

    private double random(double min, double max) {
        return min + Math.random()*(max - min + 1);
    }
}
