
public class Options {
	public String Name;
	public int Price;
	
	public Options(String Name, int Price) {
		this.Name = Name;
		this.Price = Price;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	}

}
