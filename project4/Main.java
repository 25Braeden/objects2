package project4;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Address addressUno = new Address();
        Address addressDos = new Address();

        System.out.println("Enter the following in order one line at a time for the first address: ");
        System.out.print("Street\nHouse Number\nCity\nState\nZip Code:\n");
        String street = scanner.next();
        int houseNumber = scanner.nextInt();
        String city = scanner.next();
        String state = scanner.next();
        int zipCode = scanner.nextInt();
        addressUno.setAddress(street, houseNumber, city, state, zipCode);
        System.out.println("If this is an appartment enter the number, otherwise enter 0");
        int appartmentNumber = scanner.nextInt();
        if(appartmentNumber != 0) {
            addressUno.appartmentAddress(appartmentNumber);
        }
        System.out.println("Enter the info for the second address: ");
        String street2 = scanner.next();
        int houseNumber2 = scanner.nextInt();
        String city2 = scanner.next();
        String state2 = scanner.next();
        int zipCode2 = scanner.nextInt();
        addressDos.setAddress(street2, houseNumber2, city2, state2, zipCode2);
        System.out.println("If this is an appartment enter the number, otherwise enter 0");
        int appartmentNumber2 = scanner.nextInt();
        if(appartmentNumber != 0) {
            addressUno.appartmentAddress(appartmentNumber2);
        }
        addressUno.printAddress(addressUno);
        addressDos.printAddress(addressDos);
        compareTo.compare(addressUno, addressDos);

    }
}
