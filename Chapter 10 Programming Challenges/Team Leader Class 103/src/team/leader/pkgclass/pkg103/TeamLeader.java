package team.leader.pkgclass.pkg103;

class TeamLeader extends ProductionWorker {
    private double monthlyBonus, minTrainingHours, trainingHoursAttended;
    public void setMonthlyBonus(double b){
        monthlyBonus = b;
    }
    public void setMinTrainingHours(double m){
        minTrainingHours = m;
    }
    public void setTrainingHoursAttended(double a){
        trainingHoursAttended = a;
    }
    public double getMonthlyBonus(){
        return monthlyBonus;
    }
    public double getMinTrainingHours(){
        return minTrainingHours;
    }
    public double getTrainingHoursAttended(){
        return trainingHoursAttended;
    }
}
