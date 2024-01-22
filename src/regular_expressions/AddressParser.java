package regular_expressions;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AddressParser {


    public static Map<String, String> parseAddress(String addressLine) {
        Map<String, String> addressComponents = new HashMap<>();
        // Updated regular expression to handle city names with spaces
        Pattern pattern = Pattern.compile("^(\\S[^,]+)\\s+([^,]+(?:\\s+[^,]+)*)[\\s,]*([^,]+)[,\\s]+([^,]+)\\s*,\\s*(\\S.*)$");  //^(\S[^ ]*)\s+([^ ]+)\s+([^ ]+)\s+([^,]+),\s+([^ ]+),\s+([^,]+)$
        Matcher matcher = pattern.matcher(addressLine);

        if (matcher.matches()) {
            addressComponents.put("street", matcher.group(1));
            addressComponents.put("city", matcher.group(2));
            addressComponents.put("province", matcher.group(3));
            addressComponents.put("postalCode", matcher.group(4));
        }

        return addressComponents;
    }

    public static void main(String[] args) {
        String addressLine1 = "21 Merchant Dr Mount Pearl, NL, A1N 5J4";
        String addressLine2 = "75 Aberdeen Dr Niverville, MB, R0A 0A1";

        Map<String, String> parsedAddress1 = parseAddress(addressLine1);
        Map<String, String> parsedAddress2 = parseAddress(addressLine2);

        if (!parsedAddress1.isEmpty()) {
            System.out.println("Address 1:");
            System.out.println("Street: " + parsedAddress1.get("street"));
            System.out.println("City: " + parsedAddress1.get("city"));
            System.out.println("Province: " + parsedAddress1.get("province"));
            System.out.println("Postal Code: " + parsedAddress1.get("postalCode"));
        } else {
            System.out.println("Address 1 does not match the expected format.");
        }

        if (!parsedAddress2.isEmpty()) {
            System.out.println("\nAddress 2:");
            System.out.println("Street: " + parsedAddress2.get("street"));
            System.out.println("City: " + parsedAddress2.get("city"));
            System.out.println("Province: " + parsedAddress2.get("province"));
            System.out.println("Postal Code: " + parsedAddress2.get("postalCode"));
        } else {
            System.out.println("\nAddress 2 does not match the expected format.");
        }
    }
}

