/**
 * 
 */
package com.sample.srr;
//

public class ProductDetails {

	/*Create a class Product with variables as id, name, desc, SKU, 
	 * categoryId, inventoryId, price, discountId, createdAt, modifiedAt, 
	 * deletedAt and generate getter, setter methods and constructor with all parameters
	 */
	private int Id;
	private String Name;
	private String Description;
	private String SKU;
	private int CategoryId;
	private int InventoryId;
	private double Price;
	private int DicountId;
	private String CreatedDt;
	private String ModifiedAt;
	private String DeletedAt;
	
	//Constructor below- ProductDetails 
	public ProductDetails(int Id,  String Name, String Description, String SKU, int CategoryId, int InventoryId, double Price, int DicountId, String CreatedDt,
			String ModifiedAt, String DeletedAt ) {
		this.Id = Id;
		this.Name = Name;
		this.Description = Description;
		this.SKU = SKU;
		this.CategoryId = CategoryId;
		this.InventoryId = InventoryId;
		this.Price = Price;
		this.DicountId = DicountId;
	    this.CreatedDt = CreatedDt;
	    this.ModifiedAt = ModifiedAt;
	    this.DeletedAt = DeletedAt;
	    	    	
	}


	public int getId() {
		return Id;
	}



	public void setId(int id) {
		Id = id;
	}



	public String getDescription() {
		return Description;
	}



	public void setDescription(String description) {
		Description = description;
	}



	public String getSKU() {
		return SKU;
	}



	public void setSKU(String sKU) {
		SKU = sKU;
	}



	public int getCategoryId() {
		return CategoryId;
	}



	public void setCategoryId(int categoryId) {
		CategoryId = categoryId;
	}



	public int getInventoryId() {
		return InventoryId;
	}



	public void setInventoryId(int inventoryId) {
		InventoryId = inventoryId;
	}



	public double getPrice() {
		return Price;
	}



	public void setPrice(double price) {
		Price = price;
	}



	public int getDicountId() {
		return DicountId;
	}



	public void setDicountId(int dicountId) {
		DicountId = dicountId;
	}



	public String getCreatedDt() {
		return CreatedDt;
	}



	public void setCreatedDt(String createdDt) {
		CreatedDt = createdDt;
	}



	public String getModifiedAt() {
		return ModifiedAt;
	}



	public void setModifiedAt(String modifiedAt) {
		ModifiedAt = modifiedAt;
	}



	public String getDeletedAt() {
		return DeletedAt;
	}



	public void setDeletedAt(String deletedAt) {
		DeletedAt = deletedAt;
	}

	public String getName() {
		return DeletedAt;
	}


	public void setName(String name) {
		Name = name;
	}



	public static void main(String[] args) {
		/*Create main method and 2 objects for the product and set data using set methods and perform relational, 
		logical and decision making i.e., (==, !=, <, >, <=, >= )  (&&, ||) use if else and for
 */
		
		ProductDetails P1 = new ProductDetails(1001, "Dell12", "Dell", "1034", 1001, 1234, 1234.34, 101,"2021-03-09", "2021-03-11", "2022-03-11");
		System.out.println(P1);
		
		ProductDetails P2= new ProductDetails(1001, "HP20", "HP", "1034", 1001, 1234, 1234.34, 101,"2021-03-09", "2021-03-11", "2022-03-11");
		System.out.println(P2);
		//output results are not coming for P1 and P2
			    		
    		if(P1.getName()== P2.getName()) {
    			System.out.println("It is the same Item");
    		}else if(P1.getCreatedDt()!= P2.getCreatedDt()){
    			System.out.println("It's not created on Same date");

    		}else {
    			System.out.println(" It is not the same Item");
    		}
    		
    	}


	}
