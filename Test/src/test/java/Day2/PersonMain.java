package Day2;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Person p = new Person("Divya", "Bharathi",'F');
        System.out.println("Person Details");
        
        System.out.println("---------------------");
        System.out.println("First Name:" +p.getfirstName());
        System.out.println("Last Name:" +p.getlastName());
        System.out.println("Gender:"+p.getgender());
        
        
	}

}
