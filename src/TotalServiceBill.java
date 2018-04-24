
public class TotalServiceBill {
	public String name;
	public int price;
	public int tax;
	public int Amount;

	
	Client c1;
	Options option[];
	AddonServices a[];
	
	Options opp1;
	AddonServices addon[];
	
	public TotalServiceBill(String name, int price, int tax,Options option[],AddonServices ads[]) {
		this.name = name;
		this.price = price;
		this.tax = tax;
		this.option = option;
		addon = ads;
		Amount = 0;
		
	}
	
	public void bookService(Options option, AddonServices a[]){
		
		opp1 = option;
		addon = a;
		Amount= Amount + price;
		Amount= Amount + option.Price;
		
		for(int i=0; i<addon.length; i++){
			Amount = Amount + addon[i].Price;
		}
	}
	
	
	public void printBill(){
		System.out.println("********************************************");
		System.out.println("BOOKING DETAILS");
		System.out.println("********************************************");
		//System.out.println("\nClient Name:",+);
		System.out.println("\nBookingType : "+name);
		System.out.println("\nPrice Rs: "+price);
		System.out.println("\nHallOption : "+opp1.Name);
		System.out.println("\nOptionPrice Rs: "+opp1.Price);
		System.out.println("********************************************");
		for(int i=0; i<addon.length; i++){
			System.out.println("\nAddonServices : "+addon[i].Name);
			System.out.println("\nAddonServices:Price Rs:"+addon[i].Price);
			
		}
		System.out.println("********************************************");
		System.out.println("\nTotal Rs: "+Amount);
		System.out.println("********************************************");
	}



}
