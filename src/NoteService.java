import java.util.ArrayList;
import java.util.List;


public class NoteService {

   //1
   public static List<Note> getInsuficientNotes(List<Note> notes) {
       List<Note> result = new ArrayList<>();
       for ( Note currentNote : notes )
           if ( currentNote.getNote() < 40 )
               result.add(currentNote);
       return result;
   }

    public static void printNotes(List<Note> notes) {
        for (Note note : notes) {
            System.out.print(note.getNote());
            System.out.print(" ");
        }
    }

    //2
    public static double getAverage(List<Note> notes) {
       double sum = 0;
       for (Note note : notes) {
           sum += note.getNote();
       }
       return sum / notes.size();
    }

    //3
    public static List<Note> roundGrades(List<Note> notes) {
       for (Note note : notes) {
           if ( note.getNote() >= 38 ) {
                for ( int i = 40; i <= 100; i += 5) {
                    if (note.getNote() < i && note.getNote() >= i - 2) {
                        note.setNote(i);
                        notes.set(notes.indexOf(note), note);
                        break;
                    }
                }
           }
       }
       return notes;
    }

    /*
    public static List<Note> roundGrades(List<Note> notes) {
       List<Note> result = new ArrayList<>();
       for (Note note : notes) {
           if ( note.getNote() >= 38 ) {
               int ok = 0;
               for ( int i = 40; i <= 100; i += 5) {
                    if (note.getNote() < i && note.getNote() >= i - 2) {
                        note.setNote(i);
                        result.add(note);
                        ok = 1;
                        break;
                    }
                }
               if (ok == 0)
                   result.add(note);
           }
           else result.add(note);
       }
       return notes;
    }
    */
}
