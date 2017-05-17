
package pojo;

/**
 * This class will define a company's end-of-day stock price
 * Look at resources/data/historicalStockData.json
 */
public class Stock {

    // TODO - Think back to your modelling session
    // Define the attributes of a stock price based on the
    // provided data in resources/data



	private String name;
	private String dailyClosePrice;

	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}


	public void setPrice(String dailyClosePrice){
		this.dailyClosePrice = dailyClosePrice;
	}

	public String getPrice(){
		return this.dailyClosePrice;
	}

}