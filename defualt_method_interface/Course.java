package inner;

public interface Course {
    String courseName="Java Programming";
    int durationInMonth=6;
    String Trainer ="Omkar";

    void startCourse();
    void endCourse();
    default void displayCourseInfo(){
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + durationInMonth);
        System.out.println("Trainer: " + Trainer);
    }

     static void getCourseDetails(){
        System.out.println("Course Name: Java Programming, Duration: 6 months, Instructor: Omkar");
    }
}
