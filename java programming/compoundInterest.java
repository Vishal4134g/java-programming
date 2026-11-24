public class compoundInterest{
    public static void main(String[] args){
        int principal = 1200;
        int rate = 7;
        int time = 8;
        double ammount = principal * Math.pow( 1 + (rate / 100.0), time);
        double compoundInterest = ammount - principal;
        System.out.println("Compound interest is : " + compoundInterest + " rs");
    }
}