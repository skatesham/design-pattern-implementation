package behaviour.memento;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class EmpOriginator {
	private int empId;
	private String empName;
	private String empPhoneNo;
	private String empDesignation;

	public EmpMemento saveToMemento() {
		EmpMemento empMemento = new EmpMemento(this.empId, this.empName, this.empPhoneNo, this.empDesignation);
		return empMemento;
	}

	public void undoFromMemento(final EmpMemento memento) {
		this.empId = memento.getEmpId();
		this.empName = memento.getEmpName();
		this.empPhoneNo = memento.getEmpPhoneNo();
		this.empDesignation = memento.getEmpDesignation();
	}

	public void printInfo() {
		System.out.println("ID: " + this.empId);
		System.out.println("Name: " + this.empName);
		System.out.println("Phone Number: " + this.empPhoneNo);
		System.out.println("Designation: " + this.empDesignation);
	}

}
