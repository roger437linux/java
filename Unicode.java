
class Unicode extends Thread {
	public static void main(String [] args) {
		for (int i=0 ; i<10 ; i++) {
			System.out.printf("%c\n", 0x0007);
			new Thread().sleep(1000);
		}
	}
}

/*
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class Unicode {
  public static void main (String[] argv) throws UnsupportedEncodingException {
    String unicodeMessage =
    "\u7686\u3055\u3093\u3001\u3053\u3093\u306b\u3061\u306f";

    PrintStream out = new PrintStream(System.out, true, "UTF-8");
    out.println(unicodeMessage);
  }
}
*/
