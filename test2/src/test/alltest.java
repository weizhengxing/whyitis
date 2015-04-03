package test;

public class alltest {
	public static void main(String args[]){
		Manager boss=new Manager("wangwu",1000);
		Employee aEmployee=new Employee("zhangsan",500);
		Employee bEmployee=new Employee("lisi",500);
		Employee[] staff=new Employee[3];
		staff[0]=boss;
		staff[1]=aEmployee;
		staff[2]=bEmployee;
		Manager d=(Manager) staff[1];
		d.setBonus(500);
	}
}
