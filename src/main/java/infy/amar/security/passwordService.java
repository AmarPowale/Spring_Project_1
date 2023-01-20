package infy.amar.security;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class passwordService {
	
	public static String encode(String txt) {
		Encoder encoder = Base64.getEncoder();
		String encodetoString = encoder.encodeToString(txt.getBytes());
		return encodetoString;
		
	}
	
	public static String decode(String encodedTxt) {
		Decoder decoder = Base64.getDecoder();
		byte[] decode = decoder.decode(encodedTxt);
		
		return new String(decode);
		
	}

	public static void main(String[] args) {
		String encode = passwordService.encode("amar");
		System.out.println(encode);
		
		String decode = passwordService.decode(encode);
		System.out.println(decode);
	} 
 
}
