public class PDFreportgenerator extends Report{
    public PDFreportgenerator (ReportFormat reportFormat) {
        super(reportFormat);

    }

    @Override
    public void generate() {
        reportFormat.generateReport();

    }
}
