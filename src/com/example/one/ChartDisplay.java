package com.example.one;

public class ChartDisplay {
	
	public void display(String name){
		if(name.equalsIgnoreCase("pie")){
			PieChart chart=new PieChart();
			chart.display();
		}else if(name.equalsIgnoreCase("bar")){
			BarChart chart=new BarChart();
			chart.display();
		}
	}

}
