import java.io.BufferedReader;
import java.net.InetAddress;
import java.net.URL;
import java.net.*;
import java.io.*;

public class IpAdress{
    public static void main(String args[]){
        try {
            System.out.println(InetAddress.getLocalHost());  

            URL myIP = new URL("http://checkip.amazonaws.com");
            BufferedReader nets = new BufferedReader(new InputStreamReader(myIP.openStream()));
            String ip = nets.readLine();
            System.out.println(ip);
        } catch (Exception e) {
            //TODO: handle exception
        }   
        
    }
}