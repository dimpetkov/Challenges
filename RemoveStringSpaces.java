public class Kata {
    public static String noSpace(final String x) {
      int ch = 0;
            StringBuilder sb = new StringBuilder();
            while (ch < x.length()) {
                if (x.charAt(ch) != ' ') {
                    sb.append(x.charAt(ch));
                }
                ch++;
            }
        return sb.toString();
    }
}
