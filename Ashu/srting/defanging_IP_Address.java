// Given a valid (IPv4) IP address, return a defanged version of that IP address.
// A defanged IP address replaces every period "." with "[.]".

package com.Ashu.srting;

public class defanging_IP_Address {
    public static void main(String[] args) {
        String address = "12.343.23.4";
        System.out.println(defang(address));

//        Direct meathod
//        System.out.printf(address.replace(".", "[.]"));
    }

    static String defang(String address){
        StringBuilder def = new StringBuilder();
        for (char c:address.toCharArray()) {
            def.append(c == '.' ? "[.]" : c);
        }
        return def.toString();
    }
}
