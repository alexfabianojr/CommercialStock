package database;

import java.util.ArrayList;
import java.util.List;

	
	
public class DataBaseGetAndSet extends DataBaseVariables {
	
	protected static List<DataBaseVariables> dataBaseList = new ArrayList<>();
	
	protected String newProductName;
	protected Double newProductPrice;
	protected Integer newQuantityOfTheProductInStock;
	
	public String getProductName(int codigo) {
		return dataBaseList.get(codigo).productName;
	}

	public Double getProductPrice(int codigo) {
		return dataBaseList.get(codigo).productPrice;
	}

	public Integer getQuantityOfTheProductInStock(int codigo) {
		return dataBaseList.get(codigo).quantityOfTheProductInStock;
	}
	
	public void addProductName (int code) {
		
	}
}
