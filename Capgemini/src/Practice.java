
class Employee {
	int empid;
	Employee(int eid) {
		empid=eid;
	}
	void eg() {
		System.out.println("hhhhhhh");
	}
}

class ContractEmployee extends Employee {
	ContractEmployee(){
		
		super(10);
		int empid=20;
		System.out.println(super.empid);
	}
	void eg() {
		super.eg();
		System.out.println("qqqqqqqq");
	}
}


public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContractEmployee ce=new ContractEmployee();
		ce.eg();
	}

}
