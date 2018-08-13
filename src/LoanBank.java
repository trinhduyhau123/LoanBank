public class LoanBank {
    public static double caculateInterest(double loan, double interest_rate, double range) {
        return loan * ((interest_rate + range)/12);
    }
    public static void main(String[] args) {
        double loans = 6000;
        double interest_rate = 0.075;
        double months = 60;
        double range;

        double capital = loans/months;
        System.out.println("Principal pay in " + months + " months: "+ capital);

        range = 0;
        double firstYear = caculateInterest(loans, interest_rate, range);
        System.out.println("First year: " + firstYear);

        range = 0.035;
        double nextYear = caculateInterest(loans, interest_rate, range);
        System.out.println("Next year: "+ nextYear);

    }
}
