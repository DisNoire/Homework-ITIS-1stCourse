
public class Task5 {

    public static void main(String[] args) {
        String s1 = args[0];
        String s2 = args[1];
        char[] ch1 = new char[s1.length()];
        char[] ch2 = new char[s2.length()];
        s1.getChars(0, s1.length(), ch1, 0);
        s2.getChars(0, s2.length(), ch2, 0);
        for (int j = 0; j < ch2.length; j++) {
            boolean e = false;
            for (int i = 0; i < ch1.length; i++) {
                if (ch1[i] == ch2[j]) {
                    System.out.println("ch2["+j+"]:"+"First enter:" + i);
                    e = true;
                    break;
                }
            }
            if (!e) System.out.println("ch2["+j+"]:"+"No enters");
        }
    }
}
