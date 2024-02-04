public class StringMethods {
    public static void main(String[] args) {
        String name = "Sushant";
        // length of string is determined
        int value = name.length();
        System.out.println(value);
        // all characters to lower case
        String lstring = name.toLowerCase();
        System.out.println(lstring);
        // all characters to upper case
        String ustring = name.toUpperCase();
        System.out.println(ustring);
        // this function trims the white space in any string
        String surname = "      Gupta      ";
        System.out.println(surname);
        String sur = surname.trim();
        System.out.println(sur);
        // Substring function returns String from the index number specified
        System.out.println(name.substring(5));
        System.out.println(name.substring(2, 7));
        // Replace function replaces a charter with another
        System.out.println(sur.replace('G', 'T'));
        System.out.println(name.replace("us", "iopl"));
        //This function returns true or false(boolean value)
        System.out.println(name.startsWith("Su"));
        System.out.println(name.endsWith("ty"));
        // This function return the character at a given index
        System.out.println(sur.charAt(2));
        // This function gives index of given substring
        System.out.println(sur.indexOf("ta"));
    }
}
