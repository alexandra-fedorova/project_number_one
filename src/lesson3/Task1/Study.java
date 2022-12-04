package lesson3.Task1;

public class Study {

    private String course;

    public Study(String course) {

        this.course = course;
    }

    public String getCourse() {

        return course;
    }

    public void setCourse(String course) {

        this.course = course;
    }

    @Override
    public String toString() {
        return "Study{" +
                "course='" + course + '\'' +
                '}';
    }

    public String printCourse() {

        return this.course;

    }

}



