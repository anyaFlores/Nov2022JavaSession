package OOP_Encapsulation;

public class Company {
	private String name;
	private int empCount;
	private int sharePrice;
	
//	
//	//if we dont have setter method-> create a constructor 
//	public Company(String name, int empCount, int sharePrice) {
//		this.name = name;
//		this.empCount = empCount;
//		this.sharePrice = sharePrice;
//	}
	
	//Public Getter and Setter: only for the Private variables

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpCount() {
		return empCount;
	}

	public void setEmpCount(int empCount) {
		this.empCount = empCount;
	}

	public int getSharePrice() {
		return sharePrice;
	}

	public void setSharePrice(int sharePrice) {
		this.sharePrice = sharePrice;
	}
	public static void main(String[] args) {
		// 

	}
}
