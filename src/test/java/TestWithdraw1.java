import org.junit.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestWithdraw1 {
	private create_account ca;
	
	@BeforeEach
	public void setup() {
		ca = new create_account("Arshad",1122, 50000, "saving");
	}

	@Test
	public void testwithdraw1() {
		   int money = 25000;
		   int total_bal = ca.Acc_Balance;
		   int expectedResult = 0;
		   if(total_bal-money<=0)
		   {
			   expectedResult=1;
		   }
		   else
		   {
			   expectedResult=total_bal-money;
		   }
		   int result = ca.withdraw(money);
		   Assertions.assertEquals(expectedResult,result);
			//fail("Not yet implemented");
		}
}
