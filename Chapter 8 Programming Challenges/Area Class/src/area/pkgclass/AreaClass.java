package area.pkgclass;

public class AreaClass {

    public static void main(String[] args) {
        double num = 5;
        System.out.println("Area of Shapes");
        System.out.println("Circle (Radius:"+num+"): "+Area.Area(num));
        System.out.println("Rectangle (Length:"+num+"/Width:"+num+"): "+Area.Area(num,num));
        System.out.println("Cylinder (Radius:"+num+"/Height:"+num+"): "+Area.Area(3,num,num));
    }

}
