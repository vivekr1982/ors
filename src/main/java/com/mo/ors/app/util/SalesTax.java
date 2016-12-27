package com.mo.ors.app.util;

public enum SalesTax{
	A(10),B(20),C(0);
	
	private float salesTax;

	private SalesTax(float salesTax) {
		this.salesTax = salesTax;
	}

	public float getSalesTax() {
		return salesTax;
	}

	public void setSalesTax(float salesTax) {
		this.salesTax = salesTax;
	}
}
