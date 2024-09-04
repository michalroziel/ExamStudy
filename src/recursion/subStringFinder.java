package recursion;

public class subStringFinder {

    public static void main(String[] args) {

        System.out.println( findRecursive("haystack","tack"));
    }
    //TODO: implement recursive approach

    public static boolean findRecursive(String haystack, String needle ){

        // length, equals, substring, charAt
        if (haystack.length() < needle.length()){
            return false;
        }
        else{

            if (haystack.substring(0,needle.length()).equals(needle)) {
                return true;
            }

          return   findRecursive(haystack.substring(1),needle);

        }

    }
}
