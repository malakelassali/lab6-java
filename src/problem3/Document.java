package problem3;

public class Document {
    private static int counter= 0;

    protected int numEnreg;
    protected String title;

    public Document(String title) {
        this.numEnreg= ++counter;
        this.title= title;
    }

    @Override
    public String toString() {
        return "Document #" + numEnreg + ", Title: " + title;
    }
}