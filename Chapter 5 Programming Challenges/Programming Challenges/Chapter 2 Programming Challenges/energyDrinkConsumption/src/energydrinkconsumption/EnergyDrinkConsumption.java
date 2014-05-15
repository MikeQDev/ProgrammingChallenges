package energydrinkconsumption;

public class EnergyDrinkConsumption {
    
    public static void main(String[] args) {
        int customers=12467;
        double oneOrMorePercent=.14,preferCitrus=.64;
        double oneOrMore=customers*oneOrMorePercent,
                preferCitrusTotal=customers*preferCitrus+1;
        int newOneOrMore = (int)oneOrMore;
        
        int preferCitrusInt=(int)preferCitrusTotal;
        System.out.println("There are "+newOneOrMore+" customers who "
                + "purchase one or more energy drinks per week.\n"
                + preferCitrusInt +" customers prefer citrus.");
    }

}
