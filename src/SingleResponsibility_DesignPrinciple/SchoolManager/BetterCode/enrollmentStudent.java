package SingleResponsibility_DesignPrinciple.SchoolManager.BetterCode;

public class enrollmentStudent {
    // EnrollmentService class: responsible for enrolling students

        public void enrollStudent(Student student) {
            // Code for student enrollment (e.g., saving to database, registering for classes)
            System.out.println(student.getName() + " has been successfully enrolled.");
        }

}
