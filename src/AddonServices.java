
public class AddonServices {

	public String Name;
	public int Price;
	
	public AddonServices(String Name, int Price) {
		this.Name = Name;
		this.Price = Price;
	}
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		this.Name = name;
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		this.Price = price;
	}

}
