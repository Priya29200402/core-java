package inner;

public class Trainee implements Course{
    @Override
    public void startCourse() {
        System.out.println("Trainee is starting the course");
    }

    @Override
    public void endCourse() {
        System.out.println("Trainee is ending the course");
    }

     @Override
    public void displayCourseInfo(){
        System.out.println("Course Name:"+ courseName);
        System.out.println("Duration:"+ durationInMonth);
        System.out.println("Trainer:"+ Trainer);
    }

}

