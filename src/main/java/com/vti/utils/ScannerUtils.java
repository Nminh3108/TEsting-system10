package com.vti.utils;

import java.util.Scanner;

public class ScannerUtils {
    static Scanner scanner = new Scanner(System.in);

    // Tạo 1 method để nhập vào một chuỗi bất kỳ
    public static String inputString(){
        return scanner.nextLine();
    }

    // Tạo 1 method để nhâp vào 1 số nguyên dương
    public static int inputNumber(){
        int number = Integer.parseInt(scanner.nextLine());
        while (number <= 0){
                System.out.println("Mời bạn nhập lại");
                number = Integer.parseInt(scanner.nextLine());
        }
        return number;
    }

    // Bài tập:
    // 1. Thay thế các Scanner ở các class khác bằng với phương thức trong class utils
    // 2. Tạo 1 method nhập vào đúng định dạng email
    public static String inputEmail(){
        System.out.println("Mời bạn nhập vào email");
        String email = scanner.nextLine();
        while (!email.contains("@")){
            System.out.println("Email ko đúng định dạng, mời bạn nhập lại");
            email = scanner.nextLine();
        }
        return email;
    }

    // 3. Tạo 1 method nhập vào 1 số min và max do người dùng truyền vào. VD: inputNumber(1, 4); (min = 1, max = 4);
    public static int inputNumber(int min, int max){
        int number = 0;
        while (true) {
            try {
                number = Integer.parseInt(scanner.nextLine());
                if (number<min || number > max){
                    System.out.println("Số ko đúng định dạng, mời bạn nhập lại");
                    number = Integer.parseInt(scanner.nextLine());
                    continue;
                }
                break;
            } catch (NumberFormatException ex) {
                System.err.println("Nhap vao phai la so , moi nhap lai!");
                continue;
            }
        }return number;
    }

    // 4. Tạo 1 method nhập vào 1 chuỗi là password, chứa ít nhất 6 - 12 ký tự
    public static String inputPassword(){
        System.out.println("Mời bạn nhập vào password");
        String password = scanner.nextLine();
        while (password.length() < 6 || password.length() > 12){
            System.out.println("password ko đúng định dạng, mời bạn nhập lại");
            password = scanner.nextLine();
        }
        return password;
    }
}
