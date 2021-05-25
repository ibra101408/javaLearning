package beggining;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class InetDemo {
    public static void main(String[] args) {
        InetAddress currentIP = null;
        InetAddress bsuIP = null;
        try {
            currentIP = InetAddress.getLocalHost();
            // вывод IP-адреса локального компьютера
            System.out.println("Мой IP -> " + currentIP.getHostAddress());
            bsuIP = InetAddress.getByName("www.bsu.by");
            // вывод IP-адреса БГУ www.bsu.by
            System.out.println("Обращаемся к -> " + bsuIP.getHostAddress());
        } catch (UnknownHostException e) {
            // если не удается найти IP
            System.err.println("адрес недоступен " + e);
        }
    }
}