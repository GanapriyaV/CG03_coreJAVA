package com.tnsif.interfaceprograms;

//demo for E-commerehce order procession

interface OrderService{
	boolean ValidateOrder(double amount);
	void ProcessPayment(double amount);
	void GenerateInvoice(String orderId, double amount);
	void UpdateOrderStatus(String orderId, String status);
}

class OnlineOrder implements OrderService{
	
	private String customername;
	
	//parameter cons
	
	public OnlineOrder(String customername, String orderid) {
		super();
		this.customername = customername;
	}
	
	@Override
	public boolean ValidateOrder(double amount) {
		if(amount>0) {
			System.out.println("Order validation successful");
		return true;
	}
		System.out.println("invalide order amount");
		return false;
	}

	@Override
	public void ProcessPayment(double amount) {
		System.out.println("procession payment: "+amount);
		
		System.out.println("Payment Successful");
	}

	@Override
	public void GenerateInvoice(String orderId, double amount) {
		System.out.println("Invoice generated");
		System.out.println("Order id: "+orderId);
		System.out.println("Customer name: "+customername);
		System.out.println("Amount: "+amount);
	}

	@Override
	public void UpdateOrderStatus(String orderId, String status) {
		System.out.println("Order "+orderId+" Status updated to: "+status);
	}

}

public class Mainmethod {
public static void main(String[] args) {
	OnlineOrder o=new OnlineOrder("Ruth", "ORD1001");
	
	double amount=569;
	if(o.ValidateOrder(amount)) {
		o.ProcessPayment(amount);
		o.GenerateInvoice("ORD1001", amount);
		o.UpdateOrderStatus("ORD1001", "confirmed");
	}
}
}
