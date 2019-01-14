package behaviour.memento;

import org.junit.Test;

public class EmpMementoTest {

	@Test
	public void mementoTest() {

		EmpCaretaker empCaretaker = new EmpCaretaker();
		EmpMemento empMemento;
		
		EmpOriginator empOriginator= new EmpOriginator(111,"Sham Vinicius Fiorin", "999999999999","Software Developer");
		
		empMemento = empOriginator.saveToMemento();
        empCaretaker.addMemento(empMemento);
        System.out.println("\n *** Original EmpOriginator");
        empOriginator.printInfo();
 
 
        System.out.println("\n EmpOriginator after updating phone number");
        empOriginator.setEmpPhoneNo("(12) 99665-7941");
        empMemento=empOriginator.saveToMemento();
        empCaretaker.addMemento(empMemento);
        empOriginator.printInfo();
 
        System.out.println("\n EmpOriginator after updating designation");
        empOriginator.setEmpDesignation("Senior Java Developer");
        empMemento=empOriginator.saveToMemento();
        empCaretaker.addMemento(empMemento);
       empOriginator.printInfo();
 
 
        System.out.println("\n EmpOriginator after undoing designation update");
        empMemento=empCaretaker.getMemento();
        empOriginator.undoFromMemento(empMemento);
        empMemento=empCaretaker.getMemento();
        empOriginator.undoFromMemento(empMemento);
        empOriginator.printInfo();
 
 
        System.out.println("\n Original EmpOriginator after undoing phone number update");
        empMemento=empCaretaker.getMemento();
        empOriginator.undoFromMemento(empMemento);
        empOriginator.printInfo();
 
		
	}

}
