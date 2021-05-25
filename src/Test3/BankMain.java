package Test3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankMain {
    public static ArrayList<BankAccount> people = new ArrayList<>();

    // public static final BankAccount ba = new BankAccount("alex", 123, 1);
    public static void LogIn() {
        String choice = "Q - узнать баланс, W - перевести деньги другому пользователю, Y - пополнить баланс, S - выход из банка";
        List<BankAccount> holderList = new ArrayList<>();
        //holderList.add (new BankAccount("alex", 123, 1));
        Scanner sc1 = new Scanner(System.in);
        String p1 = sc1.nextLine();


    }



    public static void W() {
        Scanner sc1 = new Scanner(System.in);
        String c1 = sc1.nextLine();
        if (c1.equals("W")) {
            System.out.println("Напишите через сумму перевода, затем имя получателя");
        }
    }


    public static void S() {
        Scanner sc1 = new Scanner(System.in);
        String c1 = sc1.nextLine();
        if (c1.equals("S")) {
            System.out.println("До свидвния, " + "ИМЯ ПОЛЬЗОВАТЕЛЯ");
        }
    }


    public void openList() {
        for (int i = 0; i < people.size(); i++) {
            System.out.println("Имя: " + people.get(i).getHolder() + " Возраст: " +
                    people.get(i).getPassword());
        }
    }
///////////////////////////////////////////////////////////////////////////////////////////////////////

    public static void main(String[] args) throws IOException {
        /*Person.add(new BankAccount("alex", 123, 1));
        people.add(new BankAccount("oleg", 222, 32));

        for (int i = 0; i < people.size(); i++) {
            System.out.println("Имя: " + people.get(i).getHolder());
            System.out.println("Возраст: " + people.get(i).getPassword());
            System.out.println("Баланс: " + people.get(i).getBalance());
*/


            BankMain bankMain = new BankMain();
            bankMain.openList();
            System.out.println("Привет! Это ваш банк! Для начала работы выполните вход.\nВаше имя:");
            LogIn();
        }
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////













/*
 if (n1.equals(name1)){
         System.out.println("Ваш пароль:");
         Scanner sc1 = new Scanner(System.in);
         String p1 = sc1.nextLine();
         if (p1.equals(pass1)){
         System.out.println("Correct! Welcome!");
         }
         }
         else {
         System.out.println("once more?");
         }*/
/////////////////https://stackoverflow.com/questions/30066881/bank-account-java-program
// ///////////http://cupc71.blogspot.com/2015/01/java-simple-bank-account-class-and.html
