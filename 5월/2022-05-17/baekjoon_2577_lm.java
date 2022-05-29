import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Baekjoon_2577_LM {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);

    /**
     * �ð� ���⵵�� ���⿡ ��õ���� �ʴ´�.
     */
    int total = (sc.nextInt() * sc.nextInt() * sc.nextInt());
    String strTotal = Integer.toString(total);

    for (int i = 0; i < 10; i++) {
      int count = 0;
      for (int j = 0; j < strTotal.length(); j++) {
        // charAt() ���� -'0' or '-48' �ʿ��ϴ�
        // �� �� �� �ƽ�Ű�ڿ� ������ ���� ����
        if ((strTotal.charAt(j) - '0') == i) {
          count++;
        }
      }
      System.out.println(count);
    }
  }
}
