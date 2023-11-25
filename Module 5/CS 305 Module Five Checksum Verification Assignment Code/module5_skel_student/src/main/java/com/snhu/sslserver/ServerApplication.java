package com.snhu.sslserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.security.MessageDigest;



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
    	
    	MessageDigest md = MessageDigest.getInstance("SHA-256");

    	 try {
    	     md.update(toChapter1);
    	     MessageDigest tc1 = md.clone();
    	     byte[] toChapter1Digest = tc1.digest();
    	     md.update(toChapter2);
    	     ...etc.
    	 } catch (CloneNotSupportedException cnse) {
    	     throw new DigestException("couldn't make digest of partial content");
    	 }
       
        return "<p>data:"+data;
    }
}
