package SingleResponsibility_DesignPrinciple.SchoolManager.BetterCode;

public class LectureManagementService {
    // Method to assign a teacher to a lecture series
    public void assignTeacherToLectureSeries(Teacher teacher, LectureSeries lectureSeries) {
        // Logic to assign the teacher to the lecture series
        System.out.println("Assigning teacher " + teacher.getName() + " (" + teacher.getSubject() + ") to lecture series: " + lectureSeries.getTitle());
    }

    // Method to manage the lecture series schedule (could include adding/removing lectures, etc.)
    public void updateLectureSeriesSchedule(LectureSeries lectureSeries, String newSchedule) {
        // Logic to update the lecture series schedule
        lectureSeries.setSchedule(newSchedule);
        System.out.println("Lecture series " + lectureSeries.getTitle() + " schedule updated to: " + newSchedule);
    }

}
