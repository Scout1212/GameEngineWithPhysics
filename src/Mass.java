public class Mass {
    private int cx, cy, radius, mass;

    private double vx, vy;
    private double ax, ay;

    private Vector netForce;

    public Mass(int cx, int cy, int radius, int mass){
        this.cx = cx;
        this.cy = cy;
        this.radius = radius;
        this.mass = mass;
        netForce = new Vector(0, 0);
    }


    //2.7211 m/(.16~)s^2
    public void act(){
        netForce = Vector.add(netForce, new Vector(0, 9.8));

        ax = netForce.getXComp()/mass;
        ay = netForce.getYComp()/mass;

        vx += ax;
        vy += ay;

        cx += vx;
        cy += vy;

        netForce = new Vector(0, 0);
    }

    //add collision to ground and maybe bounce

}
