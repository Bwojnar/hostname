/**
 * Created by bwojn on 15.11.2017.
 */
import java.net.InetAddress;
import java.util.Scanner;

public class main {
    public static void main(String args[])  throws Exception
    {
        System.out.println("Podaj ip: ");
        Scanner inp = new Scanner(System.in);
        String adresip;
        adresip = inp.nextLine();

        InetAddress inetAddress =InetAddress.getByName(adresip);
        System.out.println ("Hostname: "+ inetAddress.getHostName());
    }
}
