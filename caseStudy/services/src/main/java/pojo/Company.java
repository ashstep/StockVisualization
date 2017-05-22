package pojo;
		import java.util.List;
		import java.util.Map;

/**
 * This class will define a company's end-of-day stock price
 * Look at resources/data/historicalStockData.json
 */
public class Company {

	private String name;
	private List<Map<String, Double>> dailyClosePrice;

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return this.name;
	}

	public void setPrice(List<Map<String, Double>> dailyClosePrice){
		this.dailyClosePrice = dailyClosePrice;
	}

	public List<Map<String, Double>> getPrice(){
		return this.dailyClosePrice;
	}

}
