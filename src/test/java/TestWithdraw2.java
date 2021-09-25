import org.junit.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestWithdraw2 {
	private create_account ca;
	
	@BeforeEach
	public void setup() {
		ca = new create_account("Arshad",1122, 50000, "saving");
	}

	@Test
	public void testwithdraw2() {
		   int money = 250000;
		   int total_bal = ca.Acc_Balance;
		   int expectedResult = total_bal;
		   int result = ca.withdraw(money);
		   Assertions.assertEquals(expectedResult,result);
			//fail("Not yet implemented");
		}
}
