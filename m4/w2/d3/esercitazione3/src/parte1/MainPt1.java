package parte1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainPt1 {
	
	static Logger log = LoggerFactory.getLogger(MainPt1.class);

	public static synchronized void main(String[] args) {
		
		Asterisco ast = new Asterisco();
		Cancelletto canc = new Cancelletto();
		ast.start();
		canc.start();

	}

}
