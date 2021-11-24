package chapter5.Overriding;

import java.io.IOException;

public class Animal {
	
	protected Animal info() throws IOException{
		return new Animal();
	}

}
