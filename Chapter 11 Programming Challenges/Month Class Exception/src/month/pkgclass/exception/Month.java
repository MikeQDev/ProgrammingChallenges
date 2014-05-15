package month.pkgclass.exception;

class Month {
    private int monthNumber;
    public Month(){
        monthNumber = 1;
    }
    public Month(int m) throws InvalidMonth{
        if(m>12||m<1)
            throw new InvalidMonth(m);
        else
            monthNumber=m;
    }
    public void setMonthNumber(int m){
        if(m>12||m<1)
            monthNumber=1;
        else
            monthNumber=m;
    }    
    public Month(String m){
        switch(m.toLowerCase()){
            case "january":
                monthNumber=1;
                break;
            case "february":
                monthNumber=2;
                break;
            case "march":
                monthNumber=3;
                break;
            case "april":
                monthNumber=4;
                break;
            case "may":
                monthNumber=5;
                break;
            case "june":
                monthNumber=6;
                break;
            case "july":
                monthNumber=7;
                break;
            case "august":
                monthNumber=8;
                break;
            case "september":
                monthNumber=9;
                break;
            case "october":
                monthNumber=10;
                break;
            case "november":
                monthNumber=11;
                break;
            case "december":
                monthNumber=12;
                break;
            default:
                System.out.println("I don't know month \""+m+"\" - setting value to January (1).");
                monthNumber=1;
                break;
        }
    }
    public int getMonthNumber(){
        return monthNumber;
    }
    public String getMonthName(){
        switch(monthNumber){
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return "I don't know that month.";
        }
    }
    public String toString(){
        return getMonthName();
    }
    public boolean equals(Month m2){
        if(monthNumber==m2.monthNumber)
            return true;
        else
            return false;
    }
    public boolean greaterThan(Month m2){
        if(monthNumber>m2.monthNumber)
            return true;
        else
            return false;
    }
    public boolean lessThan(Month m2){
        if(monthNumber<m2.monthNumber)
            return true;
        else
            return false;
    }
}
