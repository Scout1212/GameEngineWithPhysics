public class Vector {
    private double xComp, yComp;
    private double angle;
    private double resultant;

    //maybe magnitude

    //whats the best way to differentiate between the two constructors?
    public Vector(double x1, double y1, double x2, double y2){

        xComp = x1 - x2;
        yComp = y1 - y2;

        angle = Math.atan2(yComp, xComp);
        resultant = Math.sqrt(Math.pow(xComp, 2) + Math.pow(yComp, 2));
    }

    public Vector(int xComp, int yComp){
        this.xComp = xComp;
        this.yComp = yComp;

        angle = Math.atan2(yComp, xComp);
        resultant = Math.sqrt(Math.pow(xComp, 2) + Math.pow(yComp, 2));
    }

    public Vector(double resultant, double angle){
        this.resultant = resultant;
        this.angle = angle;

        xComp = (int)(resultant * Math.cos(angle));
        yComp = (int)(resultant * Math.sin(angle));
    }

    public static Vector add(Vector v1, Vector v2){
        return new Vector((int)(v1.xComp + v2.xComp), (int)(v1.yComp + v2.yComp));
    }

    public static Vector subtract(Vector v1, Vector v2){
        return new Vector((int)(v1.xComp - v2.xComp), (int)(v1.yComp - v2.yComp));
    }


    public double getXComp() {
        return xComp;
    }

    public void setXComp(double xComp) {
        this.xComp = xComp;
    }

    public double getYComp() {
        return yComp;
    }

    public void setYComp(double yComp) {
        this.yComp = yComp;
    }

}
