package Test3;

import java.util.ArrayList;

public class BankAccount {
    private int index;
    private String holder;
    private int password;
    private double balance;


    public BankAccount(String holder){//,int index , int password, double balance) {
        this.index = index;
        this.holder = holder;
        this.password = password;
        this.balance = balance;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void setHolder (String name){
        holder = name;
    }

    public void setPassword (int pass){
        password = pass;
    }

    public String getHolder() {
        return holder;
    }

    public int getPassword() {
        return password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}
