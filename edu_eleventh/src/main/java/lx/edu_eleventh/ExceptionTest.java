package lx.edu_eleventh;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionTest {
	public static void main(String[] args) {
		print(); // throw 절로 되어있지만 에러가 발생하지 않음(uncheked Exception 특징)
		try { // checked Excetion 특징 예외를 처리를 해줘야한다.
			print2();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			FileReader fr = new FileReader("ExceptionTest");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	// unchecked Exception
	private static void print() throws RuntimeException {
		if (true) throw new RuntimeException();
	}
	
	private static void print2() throws Exception {
		if (true) throw new Exception();
	}
}
