
public class InterfaceClass implements InterfaceConcepts {
	/*interfaceone,interfacetwo,interfacethree are declared as method in interface file and implemented in class 
	 * file.Suppose in this class file if any methods which are apart from interface file can be implemented by using
	 * Run time polymorphism 
	 
	 */

	public static void main(String[] args) {
		//InterfaceClass obj=new InterfaceClass(); this will have methods of
		//1.Interfaced methods as we added implements
		//2.Its own methods as well as we have created with InterfaceClass
		//Suppose if we need to implement methods of only interfaced classes then we have to use as below
		InterfaceConcepts obje=new InterfaceClass();
		obje.interfaceone();
		obje.interfacetwo();
		obje.interfacethree();
	    InterfaceClass obj=new InterfaceClass();
		obj.interfaceone();
		obj.interfacetwo();
		obj.interfacethree();
		obj.noninterfacedmethod();
		
	}

	public void interfaceone() {
		
		System.out.println("interfaceone");
	}

	public void interfacetwo() {
		System.out.println("interfacetwo");
		
	}

	public void interfacethree() {
		System.out.println("interfacethree");
		
		
	}
	
	public void noninterfacedmethod() {
		System.out.println("NoninterfacedMethod");
	}
	

}
