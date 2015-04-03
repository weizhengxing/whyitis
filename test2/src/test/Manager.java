package test;

public class Manager extends Employee{
	int bonus;
	public Manager(String name, int money) {
		super(name, money);
		// TODO Auto-generated constructor stub
	}
	public void setBonus(int bonus){
		this.bonus=bonus;
	}
	public int getBonus(){
		return bonus;
	}
}
