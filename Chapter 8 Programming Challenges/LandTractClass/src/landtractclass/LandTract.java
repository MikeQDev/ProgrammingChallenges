package landtractclass;

class LandTract {
    private double length, width;
    public LandTract(double l, double w){
        length = l;
        width = w;
    }
    public double getArea(){
        return length*width;
    }
    public String toString(){
        String str;
        str="The area of this tract is "+getArea();
        return str;
    }
    public boolean equals(LandTract obj2){
        if(getArea()==obj2.getArea())
            return true;
        else
            return false;
    }
}
