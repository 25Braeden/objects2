package project4;
public class compareTo {
    public static void compare(Address address1, Address address2) {
        int tiebreaker1 = 0;
        int tiebreaker2 = 0;
        String[] tieBreaker = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

        if (address1.zip < address2.zip) {
            System.out.println(address1.street + " is smaller than " + address2.street);
        } else if (address1.zip > address2.zip) {
            System.out.println(address2.street + " is smaller than " + address1.street);
        } else {
            // If zip codes are equal, use tiebreaker
            char streetOneFirstChar = address1.street.charAt(0);
            char streetTwoFirstChar = address2.street.charAt(0);
            for (int i = 0; i < tieBreaker.length; i++) {
                if (tieBreaker[i].equalsIgnoreCase(String.valueOf(streetOneFirstChar))) {
                    tiebreaker1 = i + 1;
                } else if (tieBreaker[i].equalsIgnoreCase(String.valueOf(streetTwoFirstChar))) {
                    tiebreaker2 = i + 1;
                }
            }
            if (tiebreaker1 < tiebreaker2) {
                System.out.println(address1.street + " is smaller than " + address2.street);
            } else if (tiebreaker2 < tiebreaker1) {
                System.out.println(address2.street + " is smaller than " + address1.street);
            } else {
                System.out.println("Both addresses are equal");
            }
        }
    }
}

