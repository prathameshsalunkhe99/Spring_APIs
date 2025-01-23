package com.tka;
//Using Spring Annotations

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Flipkart")
public class MyController {
	@RequestMapping(value = "/Grocery", method = RequestMethod.GET)
	public String Grocery() {
		return " Order the Groceries...!";
	}

	@RequestMapping(value = "/Mobiles", method = RequestMethod.POST)
	public String Mobiles() {
		return " U Can Order Mobiles Here..!";

	}

	@RequestMapping(value = "/Fashion", method = RequestMethod.PUT)
	public String Fashion() {
		return " Here is the New Fashion.....!";
	}

	@RequestMapping(value = "/HomeAndFurniture", method = RequestMethod.DELETE)
	public String HomeAndFurniture() {
		return "Tere are So many varities of Furntiure....!";
	}

	@RequestMapping(value = "/Appliances", method = RequestMethod.GET)
	public String Appliances() {
		return "here are the Appliances";
	}

	@RequestMapping(value = "/Electronics", method = RequestMethod.POST)
	public String Electronics() {
		return "Here are the Electronic products....!";
	}

	@RequestMapping(value = "/Flightbooking", method = RequestMethod.PUT)
	public String Flightbooking() {
		return "here you can book your Fliget...!";
	}

	@RequestMapping(value = "BeautyToysAndMore", method = RequestMethod.DELETE)
	public String BeautyToysAndMore() {
		return "Here are some Beauty products,Toys And More....!";
	}

	@RequestMapping(value = "TwoWheelers", method = RequestMethod.GET)
	public String TwoWheelers() {
		return " U can buy Petrol or Electrical Vehicals here...!";
	}

}
