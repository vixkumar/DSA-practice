

public class string {
    public static void main(String[] args) {
        String test = "Vishal";
        char target = 's';
        System.out.println(stringfind(test, target));

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
}
