public class Main {

    public static void main(String[] args) {


     CourseManager courseManager=new CourseManager();
     StudentManager studentManager=new StudentManager();

        Course course1=new Course(1,"Programlamaya Giriş için Temel Kurs","Engin Demirog");
        Course course2=new Course(2,"Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACT)","Engin Demirog");
        Course course3=new Course(3,"Yazılım Geliştirici Yetiştirme Kampı (JavaScript)","Engin Demirog");
        Course course4=new Course(4,"Senior Yazılım Geliştirici Yetiştirme Kampı (.NET)","Engin Demirog");
        Course course5=new Course(5,"Yazılım Geliştirici Yetiştirme Kampı (C#+Angular)","Engin Demirog");
        Course course6=new Course(6,"Yazılım Geliştirici Yetiştirme Kampı-Java (2022)","Engin Demirog");

        Course [] courses= {course1,course2,course3,course4,course5,course6};

        Student student1=new Student(10000,"Abdullah Tütüncü","abdullah_ttnc@hotmail.com");
        Student student2=new Student(10001,"Mert Çakmak","mertcakmak1381@hotmail.com");
        Student student3=new Student(10002,"Emir Kaya","emir-kaya32@hotmail.com");

        Student [] students={student1,student2,student3};


        for(Course course:courses){

            System.out.println(course.name);
        }

        for(Student student:students){
            System.out.println(student.fullName);

        }

        courseManager.enrolled(course1);
        courseManager.enrolled(course2);
        courseManager.enrolled(course3);
        studentManager.showDetail(student1,course4);


    }
}