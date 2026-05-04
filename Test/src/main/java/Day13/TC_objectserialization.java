package Day13;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.ObjectInputStream;
import java.io.IOException;

class Student implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int id;
	String name;
	Student(int id,String name)
	{
		this.id = id;
		this.name = name;
	}
}

public class TC_objectserialization {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Student s1 = new Student(101,"Hari");
		FileOutputStream fos = new FileOutputStream("student.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(oos);
		oos.close();
		fos.close();
		
		FileInputStream fis = new FileInputStream("student.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Student s = (Student)ois.readObject();
		
		System.out.println("id:" +s.id);
		System.out.println("name:"+s.name);
      
		
		
	}

}
