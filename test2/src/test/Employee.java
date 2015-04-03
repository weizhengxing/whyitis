package test;
public class Employee {
	private String name;
	private int money;
	public Employee(String name,int money){
		this.name=name;
		this.money=money;
	}
	public String getName(){
		return name;
	}
	public int getMoney(){
		return money;
	}
}
