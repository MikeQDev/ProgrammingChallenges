package pkg2darrayoperations;

class TestData {
    private int[][] data = {{3,5,6,3,453,47,45,74,5634,532,46},
            {4,4564,153,1531,534,543,35,1,1521,534,453,2,1,5}};
    public int getTotal(){
        int total=0;
        for(int rows=0; rows<data.length; rows++){
            for(int cols=0; cols<data[rows].length; cols++){
                total+=data[rows][cols];
            }
        }
        return total;
    }
    public double getAverage(){
        int length=0;
        for(int rows=0; rows<data.length; rows++){
            length+=data[rows].length;
        }
        getTotal();
        return getTotal()/(double)length;
    }
    public void getRowTotal(int r){
        int total=0;
        for(int c=0; c<data[r].length; c++){
            total+=data[r][c];
        }
        System.out.println("Row "+r+" total: "+total);

    }
    public void getColTotal(int c){
        int total=0;
        for(int row=0; row<data.length; row++){
                total+=data[row][c];
        }
        System.out.println("Column "+c+" total: "+total);
    }
    public int getHighestRow(int r){
        int highest=data[r][0];
        for(int col=0; col<data[r].length; col++){
            if(data[r][col]>highest){
                highest=data[r][col];
            }
        }
        return highest;
    }
    public int getLowestRow(int r){
        int lowest=data[r][0];
        for(int col=0; col<data[r].length; col++){
            if(data[r][col]<lowest){
                lowest=data[r][col];
            }
        }
        return lowest;
    }
    
}
