package question4.model;

import java.util.Objects;

public class Product {
	private int productId;
	private String productName;
	private int productPrice;
	



public Product() {
	super();
	// TODO Auto-generated constructor stub

}




public Product(int productId, String productName, int productPrice) {
	super();
	this.productId = productId;
	this.productName = productName;
	this.productPrice = productPrice;
}




public int getProductId() {
	return productId;
}




public void setProductId(int productId) {
	this.productId = productId;
}




public String getProductName() {
	return productName;
}




public void setProductName(String productName) {
	this.productName = productName;
}




public int getProductPrice() {
	return productPrice;
}




public void setProductPrice(int productPrice) {
	this.productPrice = productPrice;
}




@Override
public String toString() {
	return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
			+ ", getProductId()=" + getProductId() + ", getProductName()=" + getProductName() + ", getProductPrice()="
			+ getProductPrice() + "]";
}




@Override
public int hashCode() {
	return Objects.hash(productId, productName, productPrice);
}




@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Product other = (Product) obj;
	return productId == other.productId && Objects.equals(productName, other.productName)
			&& productPrice == other.productPrice;
}

}