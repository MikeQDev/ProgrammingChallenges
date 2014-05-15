package freezingandboilingpointsproject;

class Temp {
    private final int ethylF=-173, ethylB=172,
            oxygenF=-362, oxygenB=-306,
            waterF=32, waterB=212, temp;
    private boolean status;
    public Temp(int t){
        temp=t;
    }
    public boolean isEthylFreezing(){
        if(temp<=ethylF){
            status=true;
        }else{
            status=false;
        }
        return status;
    }
    public boolean isEthylBoiling(){
        if(temp>=ethylB){
            status=true;
        }else{
            status=false;
        }
        return status;
    }
    public boolean isOxygenFreezing(){
        if(temp<=oxygenF){
            status=true;
        }else{
            status=false;
        }
        return status;       
    }
    public boolean isOxygenBoiling(){
        if(temp>=oxygenB){
            status=true;
        }else{
            status=false;
        }
        return status;           
    }
    public boolean isWaterFreezing(){
        if(temp<=waterF){
            status=true;
        }else{
            status=false;
        }
        return status;            
    }
    public boolean isWaterBoiling(){
        if(temp>=waterB){
            status=true;
        }else{
            status=false;
        }
        return status;                 
    }
}
