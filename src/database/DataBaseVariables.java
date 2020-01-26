package database;

public class DataBaseVariables {
		protected String productName;
		protected Double productPrice;
		protected Integer quantityOfTheProductInStock;
		
		public DataBaseVariables() {
			super();
		}

		public DataBaseVariables(String productName, Double productPrice, Integer quantityOfTheProductInStock) {
			this.productName = productName;
			this.productPrice = productPrice;
			this.quantityOfTheProductInStock = quantityOfTheProductInStock;
		}
}