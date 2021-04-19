//Abdur Mohammed
//Period 5

public class Line {

    double  m, b, a;

    /** Constructor that takes a point the line intersects with as well as its slope
     *
     * @param x - x coordinate of point
     * @param y - y coordinate of point
     * @param m - slope of line
     */
    public Line(double x, double y, double m){
        this.m = m;
        b = y - (m * x);
    }

    /** Constructor that takes in two points and generates an equation with them
     *
     * @param x1 - x coordinate of first point
     * @param y1 - y coordinate of first point
     * @param x2 - x coordinate of second point
     * @param y2 - y coordinate of second point
     */
    public Line(double x1, double y1, double x2, double y2){
        m = (y2-y1) / (x2 - x1);
        b = y1 - (m * x1);
    }

    /** Constructor that takes the slope as as well as the vertical shift of the line
     *
     * @param m - slope of the line
     * @param b - vertical shift of the line
     */
    public Line(double m, double b){
        this.m = m;
        this.b = b;
    }

    /** Constructor for a vertical line with a slope of 0
     *
     * @param a - x intercept of the vertical line
     */
    public Line(double a){
        this.a = a;
        m = 0;

    }

    @Override
    public String toString() {

        if (a == 0) {
            return "y = " + m + "x + " + b;
        } else {
            return "x = " + a;
        }
    }

    /** Method that tests whether or not two lines will intersect one another or not
     *
     * @param other - The secondary line being tested for intersection
     * @return - whether or not the lines intersect
     */
    boolean intersects(Line other){
        return (m != other.m);
    }

    /** Method that tests whether or not two lines are mathematically equal
     *
     * @param other - The secondary line being tested for mathematical equality
     * @return - whether or not the lines are mathematically equal
     */
    boolean equals(Line other){
        return (!(m != other.m)) && (!(b != other.b));
    }

    /** Method that tests whether or not two lines are parallel
     *
     * @param other - The secondary line being compared to for parallelism
     * @return - whether or not the lines are parallel
     */
    boolean isParallel(Line other){
        return !(m != other.m);
    }



}
