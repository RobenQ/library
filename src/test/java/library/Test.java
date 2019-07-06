package library;

import java.security.NoSuchAlgorithmException;
import java.sql.Date;

import com.library.utils.Util_1;

public class Test {
	public static void main(String[] args) throws NoSuchAlgorithmException {
//		System.out.println(Util_1.sHAEncrypt("456"));
//		System.out.println(Util_1.getUuid());
		System.out.println(new Date(System.currentTimeMillis()));
	}
}
