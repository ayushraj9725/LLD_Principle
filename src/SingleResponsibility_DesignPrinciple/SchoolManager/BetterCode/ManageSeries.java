package SingleResponsibility_DesignPrinciple.SchoolManager.BetterCode;
import java.util.Arrays;
public class ManageSeries {
    public static void main(String[] args) {
        // 1. Create Teacher object
        Teacher teacher = new Teacher("Dr. Smith", "Computer Science");

        // 2. Create LectureSeries object
        LectureSeries lectureSeries = new LectureSeries(
                "Data Structures and Algorithms",
                Arrays.asList("Arrays", "Linked Lists", "Stacks", "Queues", "Graphs"),
                "Mon, Wed, Fri - 10:00 AM"
        );

        // 3. Create LectureManagementService object
        LectureManagementService service = new LectureManagementService();

        // 4. Assign teacher to lecture series
        service.assignTeacherToLectureSeries(teacher, lectureSeries);

        // 5. Update lecture series schedule
        service.updateLectureSeriesSchedule(lectureSeries, "Tue, Thu - 2:00 PM");
    }
}

