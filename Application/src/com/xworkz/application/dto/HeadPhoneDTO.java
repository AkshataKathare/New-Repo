package com.xworkz.application.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import com.xworkz.application.constant.Brand;
import com.xworkz.application.constant.Color;
import com.xworkz.application.constant.TypeAndWeight;

public class HeadPhoneDTO implements Serializable {

	private Brand brand;
	private String modelNo;
	private double price;
	private boolean bass;
	private Color color;
	private TypeAndWeight typeAndWeight;
	private String customerName;
	private int invoiceNo;
	private LocalDate mfgDate;
	private int warrantyPeriod;

	public HeadPhoneDTO() {
		System.out.println("No-arg const in HeadPhoneDTO");
	}

	@Override
	public String toString() {
		return "HeadPhoneDTO [brand=" + brand + ", modelNo=" + modelNo + ", price=" + price + ", bass=" + bass
				+ ", color=" + color + ", typeAndWeight=" + typeAndWeight + ", customerName=" + customerName
				+ ", invoiceNo=" + invoiceNo + ", mfgDate=" + mfgDate + ", warrantyPeriod=" + warrantyPeriod + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(bass, brand, color, customerName, invoiceNo, mfgDate, modelNo, price, typeAndWeight,
				warrantyPeriod);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof HeadPhoneDTO)) {
			return false;
		}
		HeadPhoneDTO other = (HeadPhoneDTO) obj;
		return bass == other.bass && brand == other.brand && color == other.color
				&& Objects.equals(customerName, other.customerName) && invoiceNo == other.invoiceNo
				&& Objects.equals(mfgDate, other.mfgDate) && Objects.equals(modelNo, other.modelNo)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& typeAndWeight == other.typeAndWeight && warrantyPeriod == other.warrantyPeriod;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public String getModelNo() {
		return modelNo;
	}

	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isBass() {
		return bass;
	}

	public void setBass(boolean bass) {
		this.bass = bass;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public TypeAndWeight getTypeAndWeight() {
		return typeAndWeight;
	}

	public void setTypeAndWeight(TypeAndWeight typeAndWeight) {
		this.typeAndWeight = typeAndWeight;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getInvoiceNo() {
		return invoiceNo;
	}

	public void setInvoiceNo(int invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	public LocalDate getMfgDate() {
		return mfgDate;
	}

	public void setMfgDate(LocalDate mfgDate) {
		this.mfgDate = mfgDate;
	}

	public int getWarrantyPeriod() {
		return warrantyPeriod;
	}

	public void setWarrantyPeriod(int warrantyPeriod) {
		this.warrantyPeriod = warrantyPeriod;
	}

}
