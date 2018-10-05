public class StudentManagerTest {
    public static void main(String[] args) {
        Student andy = new Student("Andy", 23);
        System.out.println(andy.getInfomation());
        System.out.println("Name: " + andy.getName());
        System.out.println("Age: " + andy.getAge());


        StudentManager studentManager = new StudentManager();
        studentManager.displayAll();

        Student booby = new Student("Booby", 25);
        studentManager.add(booby);
        System.out.println("added " + booby.getInfomation());
        studentManager.displayAll();

        Student samy = new Student("Samy", 22);
        studentManager.add(samy);
        System.out.println("added " + samy.getInfomation());
        studentManager.displayAll();

        studentManager.find("Andy");
        studentManager.find("Michael");
        studentManager.find("Booby");
    }
}
