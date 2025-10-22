public abstract class Report {
    protected ReportFormat reportFormat;

    protected ReportFormat(ReportFormat reportFormat) {
        this.reportFormat = reportFormat;
    }

    public abstract void generate();

}
