package com.tka;
//Using Spring-Boot Annotations
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Flipkart")
public class MyController {
	@PostMapping("/Groceries")
	public String Grocery() {
		return " Order the Groceries...!";
	}

	@PutMapping("/Mobiles")
	public String Mobiles() {
		return " U Can Order Mobiles Here..!";

	}

	@GetMapping("/Fashion")
	public String Fashion() {
		return " Here is the New Fashion.....!";
	}

	@DeleteMapping("/HomeAndFurniture")
	public String HomeAndFurniture() {
		return "Tere are So many varities of Furntiure....!";
	}
@GetMapping("/Appliances")
	public String Appliances() {
		return "here are the Appliances";
	}
@PostMapping("/Electronics")
	public String Electronics() {
		return "Here are the Electronic products....!";
	}
@PutMapping("/Flightbooking")
	public String Flightbooking() {
		return "here you can book your Fliget...!";
	}
@DeleteMapping("/BeautyToysAndMore")
	public String BeautyToysAndMore() {
		return "Here are some Beauty products,Toys And More....!";
	}
@GetMapping("/TwoWheelers")
	public String TwoWheelers() {
		return " U can buy Petrol or Electrical Vehicals here...!";
	}

}
