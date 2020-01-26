public class Vector {

    public final double i;
    public final double j;

    public Vector(double i, double j) {
        this.i = i;
        this.j = j;
    }

    public double theta() {
        double theta = Math.toDegrees(Math.atan(this.j / this.i));
        if (theta < 0)
            theta += 360;
        return theta;
        // return Math.toDegrees(Math.atan(this.j / this.i));
        // return Math.atan(this.j / this.i);
    }

    public String toString() {
        return String.valueOf((int)this.theta());
        // return String.valueOf("Vector: " + String.valueOf(this.i) + " " + String.valueOf(this.j));
    }

    public static double dotProduct(Vector x, Vector y) {
        return (x.i * y.i + x.j * y.j);
    }

}
