import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentService service = new StudentService();

        while(true) {

            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch(choice) {

                case 1:

                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Course: ");
                    String course = sc.nextLine();

                    System.out.print("Enter Grade: ");
                    char grade = sc.next().charAt(0);

                    service.addStudent(id, name, age, course, grade);

                    System.out.println("Student Added Successfully");
                    break;

                case 2:

                    service.viewStudents();
                    break;

                case 3:

                    System.out.print("Enter Student ID: ");
                    int searchId = sc.nextInt();

                    if(service.searchStudent(searchId) != null)
                       // System.out.println("Student Found");
                        System.out.println(service);
                    else
                        System.out.println("Student Not Found");

                    break;

                case 4:

                    System.out.print("Enter Student ID to Update: ");
                    int updateId = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter New Name: ");
                    String newName = sc.nextLine();

                    System.out.print("Enter New Age: ");
                    int newAge = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter New Course: ");
                    String newCourse = sc.nextLine();

                    System.out.print("Enter New Grade: ");
                    char newGrade = sc.next().charAt(0);

                    if(service.updateStudent(
                            updateId,
                            newName,
                            newAge,
                            newCourse,
                            newGrade))
                        System.out.println("Student Updated Successfully");
                    else
                        System.out.println("Student Not Found");

                    break;

                case 5:

                    System.out.print("Enter Student ID to Delete: ");
                    int deleteId = sc.nextInt();

                    boolean del = service.removeStudent(deleteId);

                    if(del)
                        System.out.println("Student Deleted Successfully");
                    else
                        System.out.println("Student Not Found");

                case 6:

                    System.out.println("Thank You!");
                    sc.close();
                    System.exit(0);

                default:

                    System.out.println("Invalid Choice");
            }
        }
    }
}