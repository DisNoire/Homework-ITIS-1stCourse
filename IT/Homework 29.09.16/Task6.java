
public class Task6 {

    public static void main(String[] args) {
        String s = args[0];
        char[] ch = new char[s.length()];
        s.getChars(0,s.length(),ch,0);
        int j = 0;
        for (int i = 0; i<ch.length/2;i++){
               if (ch[i] == ch[ch.length-1-i]) j++;
        }
        if (j == ch.length/2) System.out.println("Palindrome");
        else System.out.println("Not palindrome");
    }
}
