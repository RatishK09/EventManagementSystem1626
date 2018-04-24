

public class BookingClient {

	public static void main(String[] args) {
		
	Client c1 = new Client("Satish");
		
	Options op1 = new Options("Large Hall",2000);
		
		AddonServices a1 = new AddonServices("decoration",5000);
		AddonServices a2= new AddonServices("music",2000);
		
		Options opl1[] = new Options[1];
		opl1[0] = op1;
		
		AddonServices adl1[] = new AddonServices[2];
		adl1[0] = a1;
		adl1[1] = a2;
		
		TotalServiceBill s1 = new TotalServiceBill("Hall Booking",50000,10,opl1,adl1);
		
		s1.bookService(op1, adl1);
		s1.printBill();
	}

}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		

