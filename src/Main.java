import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Note> notes = new ArrayList<>();
        notes.add(new Note(50));
        notes.add(new Note(40));
        notes.add(new Note(30));
        notes.add(new Note(80));
        notes.add(new Note(90));
        notes.add(new Note(10));

        List<Note> insufficientNotes = NoteService.getInsuficientNotes(notes);
        for (Note note : insufficientNotes) {
            System.out.print(note.getNote());
            System.out.print(" ");
        }
    }

}