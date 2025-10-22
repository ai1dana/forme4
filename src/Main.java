import javax.print.DocFlavor;

public class Main {
    public static void main (String[] args) {
        Report report = new PDFreportgenerator(new PDFformat());
        report.generate();

        Report report1 = new HTMLreportgenerator(new HTMLreport());
        report.generate();
    }mnbdfnmv
}