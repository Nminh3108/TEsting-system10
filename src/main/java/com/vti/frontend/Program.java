package com.vti.frontend;

import com.vti.utils.ScannerUtils;

public class Program {
    public static void main(String[] args) {
        Function function = new Function();
        while (true){
            System.out.println("----".repeat(20));
            System.out.println("Mời bạn chọn chức năng: ");
            System.out.println("1. Thêm mới account");
            System.out.println("2. Sửa một account");
            System.out.println("3. Xoá Account theo id");
            System.out.println("4. Tìm kiếm Account theo email");
            System.out.println("5. Tất cả account");
            System.out.println("6. Login vào hệ thống");
            System.out.println("7. Thoát chương trình");
            int chose = ScannerUtils.inputNumber(1,7);
            switch (chose){
                case 1:
                function.createAccount();
                    break;
                case 2:
                    function.updateAccount();
                    break;
                case 3:
                    function.deleteAccount();
                    break;
                case 4:
                    function.findByEmail();
                    break;
                case 5:
                    function.getAllAccount();
                    break;
                case 6:
                    function.login();
                    break;
                case 7:
                    return;
            }
        }
    }
}
