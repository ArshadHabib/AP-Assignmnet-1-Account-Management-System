import org.junit.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCheckBalance2 {
	private create_account ca;
	
	@BeforeEach
	public void setup() {
		ca = new create_account("Arshad",1122, 50000, "saving");
	}

	@Test
	public void testCheckBalance2() {
			int acn=11220;
		   int total_bal = ca.Acc_Balance;
		   int expectedResult = total_bal;
		   if(acn<=0 || acn>9999)
		   {
			   expectedResult=-1;
		   }
		   int result=ca.checkbal(acn);
		   Assertions.assertEquals(expectedResult,result);
			//fail("Not yet implemented");
		}
}
