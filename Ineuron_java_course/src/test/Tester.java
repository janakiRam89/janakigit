package test;
class Tester {

	public static void main(String[] args) {

		// Customer customer = new Customer();
		// System.out.println("Final bill amount: "+customer.payBill(40.0));
		// Parent Reference -> Parent Object

		// RegularCustomer regularCustomer = new RegularCustomer();
		// System.out.println("Final bill amount: "+regularCustomer.payBill(40.0));
		// Child Reference -> Child Object

		Customer regCust = new RegularCustomer();
		// Parent Reference -> Child Object
//		System.out.println("Final Bill : " + regCust.payBill(40.0)); 
		regCust.fun();
	}
}

class Customer {

	public double payBill(double totalPrice) {
		System.out.println("Final bill for the customer is calculated here");
		return totalPrice;
	}
	public void fun2() {
		System.out.println("it is in parent");
	}

}

class RegularCustomer extends Customer {

	@Override
	public double payBill(double totalPrice) {
		System.out.println("Final bill for the regular customer is calculated here");
		double priceAfterDiscount = totalPrice * (1 - (5f / 100));
		return priceAfterDiscount;
	}
	public void fun() {
		System.out.println("it is in child");
	}

}