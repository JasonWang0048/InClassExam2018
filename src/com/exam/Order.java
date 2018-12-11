package com.exam;

public class Order {
	
	int i;
	Ticket[] t;
	
	public Order() {
		i = 0;
		t = new Ticket[10];
	}
	
	public void add(Ticket ticket) {
		t[i] = ticket;
		i++;
	}
	
	public void print() {
		for(int j = 0; j < i; j++) {
			System.out.printf("%-10s%-9s%-5d%-3d%d\n", t[j].origin, t[j].destination, t[j].price, t[j].quantity, (t[j].price*t[j].quantity));
		}

	}
}
