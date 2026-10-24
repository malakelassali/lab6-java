package problem3;

import java.util.ArrayList;

public class Library {
    private int capacity;
    private ArrayList<Document> documents;

    public Library(int capacity) {
        this.capacity= capacity;
        this.documents= new ArrayList<>();
    }

    public void addDocument(Document document) {
        if (documents.size() < capacity) {
            documents.add(document);
        } else {
            System.out.println("Library is full.");
        }
    }

    @Override
    public String toString() {
        String result= "Library (" + documents.size()
                + "/" + capacity + " documents):\n";

        for (Document document : documents) {
            result+= document + "\n";
        }

        return result;
    }
}