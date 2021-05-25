package Test3;
import beggining.Bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Person {

    public static void main(String[] args) {

        List<BankAccount> bankAccountList = new ArrayList<>();
        bankAccountList.add(new BankAccount("someName"));
        //BankAccount someName = new BankAccount("alex");
        Scanner input = new Scanner(System.in);
        String a1 = input.nextLine();



        /*for (int i = 0; i < bankAccountList.size(); i++) {
           // System.out.println(a1 );
            if (a1.equals(bankAccountList.get(i)))
                System.out.println(a1 + i + "siiiii");

        }*/


        }

    }
//output = (username.equals(bankAccountList.get(1)) && password.equals("1")) ? "login successfully" : "login failed" ;
            //System.out.println(output);




