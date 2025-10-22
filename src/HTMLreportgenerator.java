public class HTMLreportgenerator extends Report {
    public HTMLreportgenerator (ReportFormat reportFormat) {
        super(reportFormat);
    }

    @Override
    public void generate() {
        reportFormat.generateReport();
    }
}
