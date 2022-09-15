package report;

public class BuzzwordsReport extends Report {

    public static void main(String[] args) {
        BuzzwordsReport report = new BuzzwordsReport();
        report.runReport();
    }

    @Override
    public void runReport() {
        super.runReport();
        buzzwordCompliance();
        printReport();
    }

    public void buzzwordCompliance() {

    }
}
