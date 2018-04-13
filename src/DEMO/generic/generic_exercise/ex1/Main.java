package DEMO.generic.generic_exercise.ex1;

public class Main {
    public static void main(String[] args) {
        Media book = new Book();
        Media newspaper = new Newspaper();

        System.out.println("With generic");
        LibraryGeneric<Media> libraryGeneric = new LibraryGeneric<>();
        libraryGeneric.addMedia(book);
        libraryGeneric.addMedia(newspaper);

        Media lastMedia = libraryGeneric.getLastResource();
        lastMedia.write();

        /*LibraryNonGeneric libraryNonGeneric = new LibraryNonGeneric();
        libraryNonGeneric.addMedia(media1);
        libraryNonGeneric.addMedia(media2);
        Media lastMedia2 = libraryNonGeneric.getLastResource();
        lastMedia2.write();*/

    }
}
