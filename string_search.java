

public class string_search {
    public static void main(String[] args) {
        String test = "Vishal";
        char target = 's';
        System.out.println(stringfind(test, target)); // method 1
                System.out.println(string1find(test, target)); // method 2



    }

    static boolean stringfind(String str, char  target) {
          if (str.length() == 0) { // here function is used 
            return false;
          } 

          
            for (int i = 0; i < str.length(); i++) {
                 if (target == str.charAt(i)) {
                    return true;
                 }
            }
          return false;
    }

    static boolean string1find(String str, char target) {
        for (char ch : str.toCharArray()) {
            if (ch ==target) {
                return true;
            }
        }
        return false;
    }
}
