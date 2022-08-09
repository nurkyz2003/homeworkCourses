public class Student {
    private int age;
    private String name;
    private String pol;
    private int speed;
    public String levelenglish;
    public String format;

    public Student (){

    }
    public Student(int age,String name,String pol,int speed,String levelenglish, String format) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("ERROR");
        }

        if (name.length() > 2) {
            this.name = name;
        } else {
            System.out.println("ERROR");
        }

        if ((pol.equals("Female")) || (pol.equals("Male"))) {
            this.pol = pol;
        } else {
            System.out.println("ERROR");
        }

        this.speed = speed;

        this.levelenglish = levelenglish;

        if ((format.equals("Online")) || (format.equals("Offline"))) {
            this.format = format;
        } else {
            System.out.println("ERROR");
        }

    }

    public void setAge(int age){
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPol(String pol){
        this.pol = pol;
    }

    public void setSpeed(int speed){
        this.speed = speed;
    }

    public void setLevelenglish(String levelenglish){
        this.levelenglish = levelenglish;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public String  getPol(){
        return pol;
    }

    public int getSpeed() {
        return speed;
    }

    public String getLevelenglish() {
        return levelenglish;
    }

    public String getFormat() {
        return format;
    }
}
