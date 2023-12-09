package com.snhu.sslserver;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SslServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SslServerApplication.class, args);
	}

}
//FIXME: Add route to enable check sum return of static data example:  String data = "Hello World Check Sum!";
@RestController
class ServerController{
    @RequestMapping("/hash")
    public String myHash(){
    	String data = "Derek Kwasniewski's Check Sum!";
    	MessageDigest messageDigest = null; // Create MessageDigest object 
    	
		try {
			// Instantiate messageDigest with selected algorithm cipher
			messageDigest = MessageDigest.getInstance("SHA-256");
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		
    	// Use digest method on the data value to get byte[] hash
    	byte[] hash = messageDigest.digest(data.getBytes());
    	String hex = bytesToHex(hash);
    	
        return "<p>data: "+ data + "\n <p>Name of Cipher Algorithm Used: SHA-256\n  <p>Checksum Value: " + hex;
    	
    }
    
    // Convert byte array to hex string
    public static String bytesToHex(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (byte hashByte : bytes) {
            int intVal = 0xff & hashByte;
            if (intVal < 0x10) {
                sb.append('0');
            }
            sb.append(Integer.toHexString(intVal));
        }
        return sb.toString();
    }
}