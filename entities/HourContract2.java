package entities;

import java.time.LocalDate;

public class HourContract2 {
	
	private LocalDate date;
	private Double valuePerHour;
	private Integer hours;
	
	public HourContract2() {
		
	}
	
	public HourContract2(LocalDate date, Double valuePerHour, Integer hours) {
		this.date = date;
		this.valuePerHour = valuePerHour;
		this.hours = hours;
	}
	
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	public LocalDate getDate() {
		return date;
	}
	
	public void setvaluePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}
	
	public Double getValuePerHour() {
		return valuePerHour;
	}
	
	public void setHours(Integer hours) {
		this.hours = hours;
	}
	
	public Integer getHours() {
		return hours;
	}
	
	public Double totalValue() {
		return valuePerHour*hours;
	}
	

}
