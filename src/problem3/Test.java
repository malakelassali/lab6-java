package problem3;

public class Test {
    public static void main(String[] args) {
        Library library= new Library(3);

        Novel novel= new Novel("The Alchemist", "Paulo Coelho", 200, 120);
        Textbook textbook= new Textbook("Java Programming", "John Doe", 450, "Beginner");
        Magazine magazine= new Magazine("Vogue", "October", 2026);

        library.addDocument(novel);
        library.addDocument(textbook);
        library.addDocument(magazine);

        System.out.println(library);
    }
}