package com.vti.frontend;

import com.vti.backend.Example;
import com.vti.entity.Account;
import com.vti.utils.ScannerUtils;

import java.util.List;

public class Function<accounts> {
    Example example = new Example();
    public void createAccount(){
        System.out.println("Moi ban nhap Usernaem:");
        String username = ScannerUtils.inputString();
        System.out.println("Moi ban nhap vao email:");
        String email = ScannerUtils.inputEmail();
        System.out.println("Moi ban nhap vao password:");
        String password = ScannerUtils.inputPassword();
        example.creareAccount(username,email,password);
    }

    public void updateAccount(){

        System.out.println("Nhap vao id nguoi dung muon thay doi password");
        int id = ScannerUtils.inputNumber();
        System.out.println("Nhap vao password cu ");
        String oldPassword = ScannerUtils.inputPassword();
        System.out.println("Nhap vao password moi");
        String newPassword = ScannerUtils.inputPassword();
        example.updateAccount(id, oldPassword, newPassword);
    }

    public void deleteAccount(){
        System.out.println("Nhap vao id nguoi dung muon xoa");
        int id = ScannerUtils.inputNumber();
        example.deleteAccount(id);
    }

    public void findByEmail(){
        System.out.println("Moi ban nhap vao tu khoa muon tim kiem");
        String key = ScannerUtils.inputString();
        List<Account > accountList = example.findAllByEmail(key);
        String leftAlignFormat = "| %-3s| %-15s | %-17s | %-15s |%n";
        System.out.format("+----+-----------------+-------------------+-----------------+%n");
        System.out.format("| id |     fullName    |       email       |     password    |%n");
        System.out.format("+----+-----------------+-------------------+-----------------+%n");
        for (Account account: accountList) {
            System.out.format(leftAlignFormat, account.getAccountId(), account.getFullName(), account.getEmail(), account.getPassword());
        }
        System.out.format("+----+-----------------+-------------------+-----------------+%n");
    }

    public  void getAllAccount(){
        List<Account> accounts = example.getAllAccount();
            String leftAlignFormat = "| %-3s| %-15s | %-17s | %-15s |%n";
            System.out.format("+----+-----------------+-------------------+-----------------+%n");
            System.out.format("| id |     fullName    |       email       |     password    |%n");
            System.out.format("+----+-----------------+-------------------+-----------------+%n");
            for (Account account: accounts) {
                System.out.format(leftAlignFormat, account.getAccountId(), account.getFullName(), account.getEmail(), account.getPassword());
            }
            System.out.format("+----+-----------------+-------------------+-----------------+%n");
        }

    public  void login(){
        System.out.println("Moi ban nhap vao email");
        String email = ScannerUtils.inputEmail();
        System.out.println("Moi ban nhap vao password");
        String password = ScannerUtils.inputPassword();
        if(example.login(email,password)){
            System.out.println("Dang nhap thanh cong ");
        }else {
            System.out.println("Dang nhap that bai");
        }
    }
}
