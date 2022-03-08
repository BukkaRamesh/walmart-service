/**
 * 
 */
package com.sample.manasvi;

/**
 * @author manasvibhardwaj
 *
 */
public class Day2TestClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerPojo pojo=new CustomerPojo();
		
		pojo.setId(1234);
		pojo.setFirstNama("Manasvi"); //pojo.FirstNama="ManasviMainClass"; // tried setting value from main class
		pojo.setLastNama("Bhardwaj");
		pojo.setStreet("Linstreet");
		pojo.setPostalCode("12345678910");
		pojo.setCity("rutherford");
		
		System.out.println("ID = "+pojo.getId()+"\n"+"First Name = " +pojo.getFirstNama()+"\n"+"Last Name = "+pojo.getLastNama()+"\n"+"Street = "+pojo.getStreet()+"\n"+"Postal Code = "+pojo.getPostalCode()+"\n"+"City = "+pojo.getCity());
		
	    //System.out.println("ID = "+pojo.getId()+"\n"+"First Name = " +pojo.FirstNama+"\n"+"Last Name = "+pojo.getLastNama()+"\n"+"Street = "+pojo.getStreet()+"\n"+"Postal Code = "+pojo.getPostalCode()+"\n"+"City = "+pojo.getCity());
		

	}

}
