package lesson8;

public class Aspirant extends Student {
    private String work;

    public Aspirant(String firstName, String lastName, String group, double averageMark, String work) {
        super(firstName, lastName, group, averageMark);
        this.work = work;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public int getScholarship() {
        if (getAverageMark() == 5) {
            return 200;
        } else
            return 180;
    }

    public static void main(String[] args) {
        Student student = new Student("Grim", "Heavy", "f5", 5);
        Aspirant aspirant1 = new Aspirant("Oleg", "Z", "f4", 4, "Whot&=?");
        Aspirant aspirant2 = new Aspirant("Fly", "The First", "fly", 5, "job");
        Student[] students = {student, aspirant1, aspirant2};
        System.out.println(aspirant1.getFirstName());
        System.out.println(aspirant1.getLastName());
        System.out.println(aspirant1.getGroup());
        System.out.println(aspirant1.getAverageMark());
        System.out.println(aspirant1.getWork());
        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());
        System.out.println(student.getGroup());
        System.out.println(student.getAverageMark());
        System.out.println(aspirant2.getWork());
        for (Student student1 : students) {
            System.out.println("Money " + student1.getScholarship());
        }
    }
}
