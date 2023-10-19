// Implementação concreta do Factory Method para PDF
class PDFDocumentFactory implements DocumentFactory {
    @Override
    public Document createDocument() {
        return new PDFDocument();
    }
}