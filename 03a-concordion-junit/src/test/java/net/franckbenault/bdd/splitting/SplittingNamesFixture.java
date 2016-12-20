package net.franckbenault.bdd.splitting;

import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;

@RunWith(ConcordionRunner.class)
public class SplittingNamesFixture {

	
	 public FirstLastName split(String fullName) {
		 FirstLastName res = Splitter.split(fullName);	 
		 System.out.println(res);
		 return res;
	 }


}
