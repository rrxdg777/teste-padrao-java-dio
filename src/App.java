import java.io.IOException;

public class App {
        public static void main(String[] args) throws IOException {
        // Crie uma fábrica de PDF
        DocumentFactory pdfFactory = new PDFDocumentFactory();
        Document pdfDocument = pdfFactory.createDocument();
        pdfDocument.createDocument();

        // Crie uma fábrica de CSV
        DocumentFactory csvFactory = new CSVDocumentFactory();
        Document csvDocument = csvFactory.createDocument();
        csvDocument.createDocument();
    }
}
