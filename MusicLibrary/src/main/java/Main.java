
import java.io.IOException;

import core.Log;

public class Main {
	public static void main(String[] args) {
		Log.print();
		try {
			System.in.read();
		} catch (IOException e) {
		}
		System.exit(0);
	}
}
