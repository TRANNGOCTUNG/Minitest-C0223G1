package exercise4;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\t------------------------------Khởi tạo đối tượng 1----------------------------------");
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();
        System.out.println(" Nhập tên học viên 1: ");
        student.setTenHV(scanner.nextLine());
        System.out.println(" Nhập tuổi học viên 1:");
        student.setAgeHV(scanner.nextInt());
        System.out.println(" Nhập lớp học viên 1:");
        student.setLopHV(scanner.next());
        System.out.println(" Nhập điểm thực hành 1: ");
        student.setDiemTH(scanner.nextFloat());
        System.out.println(" Nhập Điểm lý thuyết 1: ");
        student.setDimeLT(scanner.nextFloat());
        System.out.printf("%6s %10s %10s %10s %10s %10s\n ", "Tên Học viên ", " Tuổi học viên ", " Lớp học viên "," Điểm thực hành học viên ", " Điểm lý thuyết học viên "," Điểm trung bình học viên");

        System.out.println("\t-------------------------------Khởi tạo đối tượng 2---------------------------------");
        Student student2 = new Student();
        System.out.println(" Nhập tên học viên 2: ");
        student2.setTenHV(scanner.next());
        System.out.println(" Nhập tuổi học viên 2:");
        student2.setAgeHV(scanner.nextInt());
        System.out.println(" Nhập lớp học viên 2:");
        student2.setLopHV(scanner.next());
        System.out.println(" Nhập điểm 'thực hành 2: ");
        student2.setDiemTH(scanner.nextFloat());
        System.out.println(" Nhập Điểm lý thuyết 2: ");
        student2.setDimeLT(scanner.nextFloat());
        System.out.println("\t---------------------------------Kết quả-------------------------------");
        student.inHV();
        student2.inHV();
        System.out.println("\n --------------------------------End--------------------------------");
    }
}
