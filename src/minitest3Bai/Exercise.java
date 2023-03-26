package minitest;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Minitest - C0223G1");
        System.out.println("\t-------------------------------------------------");
        System.out.println("""
                Exercise:
                1.Hiển thị các số nguyên tố nhỏ hơn n.
                2.Viết chương trình tìm số lớn nhat của mảng, tính tổng các phần tử trong mảng.
                3.Tạo độ dài nhập vào mảng từ bàn phím, nhập giá trị rồi in ra màn hình.
                0.Thoát.
                """);
        System.out.println("\t-------------------------------------------------");

        System.out.println("\n Nhập bài tập.");
        int number = scanner.nextInt();

        switch (number){
            case 1 -> {
                int n;
                int status = 1;
                int num = 3;
                System.out.println("Nhập số nguyên tố n");
                n = scanner.nextInt();
                System.out.println(2 + " là số nguyên tố");
               while(num < n){
                   for(int i = 2; i <= Math.sqrt(num); i++){
                       if(num % i == 0){
                           status = 0;
                           break;
                       }
                   }
                   if(status != 0){
                       System.out.println(num + " là số nguyên tố");
                   }
                   status = 1;
                   num++;
               }
            }
            case 2 -> {
                System.out.println("Cho một mảng số nguyên n phần tử");
                int size;
                int sum = 0;
                do {
                    System.out.println("Nhập kích cỡ của mảng");
                    size = scanner.nextInt();
                    if(size > 10){
                        System.out.println(" Kích cỡ mảng quá lớn mời nhập lại");
                    }
                } while ( size > 10);
                int[] array = new int[size];
                for (int i = 0; i < array.length; i++) {
                    System.out.println(" nhập phần tử thứ : " + i);
                    array[i] = scanner.nextInt();
                }
                for (int i = 0; i < array.length; i++) {
                    System.out.println(array[i] + " ");
                }
                for (int j = 0; j < array.length; j++) {
                    sum += array[j];
                }
                System.out.println(" Tổng của mảng = " + sum);
                int max = array[0];
                int index = 0;
                for(int k = 0; k < array.length; k ++ ) {
                    if( array[k] > max){
                        max = array[k];
                        index = k;
                    }
                }
                System.out.println(" Phần tử lớn nhất = " + max + " vị trí thứ " + index);
            }
            case 3 -> {
                int size;
                do{
                    System.out.println(" Nhập kích cỡ của mảng:");
                    size = scanner.nextInt();
                    if(size > 10){
                        System.out.println(" Số phần tử quá lớn mời nhập lại ");
                    }
                } while (size > 10);
                int [] array = new int[size];
                for (int i = 0; i < array.length; i++) {
                    System.out.println(" Nhập phần tử thứ: " + i);
                    array[i] = scanner.nextInt();
                }
                for (int m = 0; m < array.length; m++) {
                    System.out.print(array[m] + " ");
                }
                System.out.println("\n Mảng sau khi đảo ngược");
                int temp;
                for(int g = 0; g < array.length / 2; g++) {
                    temp = array[g];
                    array[g] = array[size -1 -g];
                    array[size -1 -g] = temp;
                }
                for (int h = 0; h < array.length; h++) {
                    System.out.print(array[h] + " ");
                }
            }
            case 0 -> System.exit(0);
            default -> System.out.println(" Bài tập trên không có");
        }
        System.out.println("\t----------------------------------------------------------------");
        System.out.println(" Have a nice day!");
    }
}
