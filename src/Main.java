import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> notes = List.of(10, 55, 23, 67, 89, 34, 54, 90);
        GradeBook gradeBook = new GradeBook(notes);

        //1
        List<Note> insuficientNotes = NoteService.getInsuficientNotes(gradeBook.getGradeBook());
        System.out.print("Insuficient Notes: ");
        NoteService.printNotes(insuficientNotes);

        System.out.println();

        //2
        double average = NoteService.getAverage(gradeBook.getGradeBook());
        System.out.println("Average: " + average);

        //3
        List<Note> roundedGrades = NoteService.roundGrades(gradeBook.getGradeBook());
        System.out.print("Rounded Grades: ");
        NoteService.printNotes(roundedGrades);
    }

}