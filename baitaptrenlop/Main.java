package baitaptrenlop;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập danh sách 5 sinh viên từ bàn phím
        List<Student> studentList = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            System.out.println("Nhập thông tin sinh viên thứ " + i + ":");
            System.out.print("Họ và tên đệm: ");
            String lastName = scanner.nextLine();
            System.out.print("Tên: ");
            String firstName = scanner.nextLine();
            System.out.print("Giới tính (Nam/Nữ): ");
            boolean gender = scanner.nextLine().equalsIgnoreCase("Nam");

            Student student = new Student(i, firstName, lastName, gender);
            studentList.add(student);
        }

        // Hiển thị danh sách sinh viên theo nhóm họ
        Map<String, List<Student>> studentByLastName = new HashMap<>();
        for (Student student : studentList) {
            String lastName = student.getLastName();

            if (!studentByLastName.containsKey(lastName)) {
                studentByLastName.put(lastName, new ArrayList<>());
            }

            studentByLastName.get(lastName).add(student);
        }

        System.out.println("Danh sách sinh viên theo nhóm họ:");
        for (String lastName : studentByLastName.keySet()) {
            System.out.println(lastName);
            List<Student> students = studentByLastName.get(lastName);
            for (Student student : students) {
                System.out.println(" " + student);
            }
        }
    }
}
