package geometry.calc;

class Geometry {
    private static double base, height, radius, length, width;
    public static double circArea(double r){
        radius = r;
        return Math.PI*Math.pow(radius, 2);
    }
    public static double rectArea(double l, double w){
        length=l;
        width=w;
        return length*width;
    }
    public static double triArea(double b, double h){
        base=b;
        height=h;
        return base*height*.5;
    }
}