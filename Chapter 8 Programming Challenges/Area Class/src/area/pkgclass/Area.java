package area.pkgclass;

class Area {
    private static double x, radius, width, length, height;
    public static double Area(double r){
        radius = r;
        return Math.PI*Math.pow(radius, 2);
    }
    public static double Area(double l, double w){
        length = l;
        width = w;
        return length*width;
    }
    public static double Area(double x, double r, double h){
        radius = r;
        height = h;
        return Math.PI*Math.pow(radius,2)*height;
    }
}
