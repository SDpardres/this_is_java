package ch11.sec04;

import java.io.FileInputStream;
import java.io.IOException;

public class FileTryWiteResource {

	public FileTryWiteResource() {
		
		try(FileInputStream file = new FileInputStream("file.txt")){
			
		}catch(IOException e) {
			e.getStackTrace();
		}
		
	}
	
	
}

