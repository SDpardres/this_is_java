package ch11.sec04;

import java.io.FileInputStream;
import java.io.IOException;

public class NewFileHanding implements AutoCloseable{

	public String name;
	
	@Override
	public void close() throws Exception {
		System.out.printf("파일[%s] 닫기\n", this.name);
	}

}
