// Implementação concreta do Factory Method para CSV
public class CSVDocumentFactory implements DocumentFactory {
    
    @Override
    public Document createDocument() {
        return new CSVDocument();
    }

}