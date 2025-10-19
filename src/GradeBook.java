import java.util.ArrayList;
import java.util.List;

public class GradeBook {
    private List<Note> gradeBook = new ArrayList<>();

    public GradeBook(List<Integer> notes) {
        for ( Integer currentNote : notes )
            gradeBook.add( new Note(currentNote) );
    }

    public List<Note> getGradeBook() {
        return gradeBook;
    }

    public void printNotes() {
        for (Note note : gradeBook) {
            System.out.print(note.getNote());
            System.out.print(" ");
        }
    }

}
