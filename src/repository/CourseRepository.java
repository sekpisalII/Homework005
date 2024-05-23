package repository;
import excention.NumNotFound;
import model.Course;
import service.ServiceCourse;
import service.ServiceCourseImp;
import java.util.*;

public class CourseRepository {
    static List<Course> courses = new ArrayList<>();
    public static void getCourses() {
        ServiceCourse courseService = new ServiceCourseImp();
        Random random = new Random();
        String date = courseService.localDate();
        try {
            Integer[] arr = {0,1,2,3,4,5,6,7,8,9};
            System.out.print("[+] Insert course title: ");
            String title = new Scanner(System.in).nextLine();
            for (int arr1 : arr) {
                if (title.contains(String.valueOf(arr1))) {
                    throw new NumNotFound("Invalid title: " + title);
                }
            }
            System.out.print("[+] Insert instructor : ");
            String[] instructor = new Scanner(System.in).nextLine().split(",");
            for (int arr1 : arr) {
                for (String instructor1 : instructor) {
                    if (instructor1.contains(String.valueOf(arr1))) {
                        throw new NumNotFound("Invalid input instructor: " + instructor1);
                    }
                }
            }
            System.out.print("[+] Insert course requirement: ");
            String[] requirement = new Scanner(System.in).nextLine().split(",");
            for (int arr1 : arr) {
                for (String requirement1 : requirement) {
                    if (requirement1.contains(String.valueOf(arr1))) {
                        throw new NumNotFound("Invalid input requirement: " + requirement1);
                    }
                }
            }
            courses.add(new Course(random.nextInt(1000),title,instructor,requirement,date));
        }catch (NumNotFound noInputNum) {
            System.out.println(noInputNum.getMessage());
        }
    }
    public static List<Course> storeCourse() {
        return courses;
    }
}
