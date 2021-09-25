import org.junit.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestDeposit1 {
	private create_account ca;
	
	@BeforeEach
	public void setup() {
		ca = new create_account("Arshad",1122, 50000, "saving");
	}

	@Test
	public void testDepsit1() {
		   int money = 25000;
		   int total_bal = ca.Acc_Balance+money;
		   int expectedResult = total_bal;
		   ca.deposite(1122, money);
		   int result=ca.Acc_Balance;
		   Assertions.assertEquals(expectedResult,result);
			//fail("Not yet implemented");
		}
}
