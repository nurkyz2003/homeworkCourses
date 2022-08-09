public class Main {
    public static void main(String[] args) {

        Student student = new Student(19,"Nurkyz","Female",33,"Intermadite","Online");
        Student student1 =  new Student(20,"Burulai","Female",30,"Intermadite","Online");
        Student student2 = new Student(15,"Madina","Female",17,"Beginner","Offline");

        Course course = new Course("Peaksoft(Java)","Zhanarbek","01.07.22", new Student[]{student, student1, student2},"01.04.23","Str.Grajdanskaya 119",30);
        System.out.printf(" %s\n %s\n %s\n %s\n %s\n",("Courses name is: " + course.getCoursname()),("Mentors name is: " + course.getTeachername()),("Course is begin: " + course.getBeginday()),("Course is finish: " + course.getDuration()),("Corses adress: " + course.getAdress()));
    }
}