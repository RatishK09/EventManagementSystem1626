import org.junit.jupiter.api.Test;

class testcase2 {

	@Test
	void test() {
	Client cl1 = new Client("Satish");
		
		Options op1 = new Options("Large Hall",2000);
		
		AddonServices a1 = new AddonServices("Decoration",5000);
		
		Options opl1[] = new Options[1];
		opl1[0] = op1;
		
		AddonServices adl1[] = new AddonServices[1];
		adl1[0] = a1;
		
		TotalServiceBill s1 = new TotalServiceBill("Hall Booking",50000,10,opl1,adl1);
		
		s1.bookService(op1, adl1);
		s1.printBill();
	}

}
