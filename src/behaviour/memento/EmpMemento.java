package behaviour.memento;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class EmpMemento {
	private int empId;
	private String empName;
	private String empPhoneNo;
	private String empDesignation;
}
