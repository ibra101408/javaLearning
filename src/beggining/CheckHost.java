package beggining;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class CheckHost {
    public static void main(String[] args) {
        // задание IP-адреса в виде массива
        byte[] ip = {127, 3, 42, 31};
        try {
            InetAddress addr = InetAddress.getByAddress("University", ip);
            System.out.println(addr.getHostName() +
                    "-> соединение:" + addr.isReachable(1000));
        } catch (UnknownHostException e) {
            System.err.println("адрес недоступен " + e);
        } catch (IOException e) {
            System.err.println("ошибка потока " + e);
        }
    }
}