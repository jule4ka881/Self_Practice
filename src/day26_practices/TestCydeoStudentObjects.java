package day26_practices;

public class TestCydeoStudentObjects {
    public static void main(String[] args) {

CydeoStudent student1 = new CydeoStudent("Rashid",25,'M',32,'A',98,3);
        CydeoStudent student2 = new CydeoStudent("Raffi",45,'M',27,'A',91,1);
        System.out.println(student1);
        System.out.println(student2);

        student1.printSchoolName();
        student2.printSchoolName();

        student1.printProgLanguage();
        student2.printProgLanguage();




    }
}
