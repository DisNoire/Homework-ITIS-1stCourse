
public class Task4 {

    public static void main(String[] args) {
        String s1 = args[0];
        String s2 = args[1];
        char[] ch1 = new char[s1.length()];
        char[] ch2 = new char[s2.length()];
        s1.getChars(0,s1.length(),ch1,0);
        s2.getChars(0,s2.length(),ch2,0);
        if (ch1.length == ch2.length) {
            int j = 0;
            for (int i = 0; i < ch1.length; i++) {
                if (ch1[i] == ch2[i]) j++;
            }
            if (j == ch1.length) System.out.println("Strings match");
            else System.out.println("Strings different");
        }
        else System.out.println("Strings different");
    }
}