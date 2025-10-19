import java.util.ArrayList;
import java.util.List;


public class NoteService {

   public static List<Note> getInsuficientNotes(List<Note> notes) {
       List<Note> result = new ArrayList<>();
       for ( Note currentNote : notes )
           if ( currentNote.getNote() < 40 )
               result.add(currentNote);
       return result;
   }


}
