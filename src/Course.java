public class Course {
    private String coursname;
    public String teachername;
    private String beginday;

    private Student[] students = new Student[70];
    private String duration;
    private String adress;
    private int speed;
    public Course(){
    }
    public Course(String coursname,String teachername, String beginday,Student[] students, String duration, String adress,int speed) {
        this.coursname = coursname;

        if (teachername.length() > 2) {
            this.teachername = teachername;
        } else {
            System.out.println("ERROR");
        }

        this.beginday = beginday;

        this.duration = duration;

        this.adress = adress;

        this.speed = speed;

        int counter = 0;
        for (Student student : students) {
            if (student.getSpeed() >= getSpeed()) {
                counter++;
                System.out.println("Proshlel(-la): " + student.getAge() + " " + student.getName() + " " + student.getPol() + " " + student.getSpeed() + " " + student.getLevelenglish() + " " + student.getFormat());
            } else {
                System.out.println("null");
            }
        }

        System.out.println(counter + " - Studenta proshli!");
        this.students = students;
    }
    public void setCoursname(String coursname){
        this.coursname = coursname;
    }

    public void setTeachername(String teachername){
        this.teachername = teachername;
    }

    public void setBeginday(String beginday){
        this.beginday = beginday;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public void setDuration(String duration){
        this.duration = duration;
    }

    public void setAdress(String adress){
        this.adress = adress;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getCoursname(){
        return coursname;
    }
    public String getTeachername(){
        return teachername;
    }
    public String getBeginday(){
        return beginday;
    }

    public Student[] getStudents() {
        return students;
    }

    public String getDuration(){
        return duration;
    }
    public String getAdress(){
        return adress;
    }

    public int getSpeed() {
        return speed;
    }
}