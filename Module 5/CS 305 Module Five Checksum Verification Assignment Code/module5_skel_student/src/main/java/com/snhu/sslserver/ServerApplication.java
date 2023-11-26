package com.snhu.sslserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;



@SpringBootApplication
public class ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);
	}

}

@RestController
class ServerController{
//FIXME:  Add hash function to return the checksum value for the data string that should contain your name.  
    @RequestMapping("/hash")
    public String myHash(){
    	String data = "Derek Kwasniewski";
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
