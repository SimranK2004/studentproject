package printingstudentdetails;

public class PrintingStudentDetails {
    public static void main(String[] args) {
        Student[] list = new Student[3];
		
		Student s1 = new Student();
		s1.setname("Khushi");
		s1.setage(19);
		
		Student s2 = new Student();
		s2.setname("Reva");
		s2.setage(15);
		
		Student s3 = new Student();
		s3.setname("Naman");
		s3.setage(19);
		
		list[0] = s1;
		list[1] = s2;
		list[2] = s3;
		
		for(int i=0; i<list.length; i++)
		{
			System.out.println(list[i].getname() + " " + list[i].getage());
                        System.out.println("Learn Github operations");
		}
    }
    
}
