package java_oops_15thApr_2023;

public class Assignment {

	
	String firstname;
	String lastname;
	String email;
	String school;
	String subject;
	int age;
	int telephone;
	
	
	public static void main(String[] args) {
		
		Assignment s1 = new Assignment("Rim", "Luss", "Rim.Luss@gmail.com", "French", "Math", 20, 11111111);
		System.out.println(s1.firstname + "--" + s1.lastname + "--" + s1.email + "--" + s1.school + "--" + s1.subject + "--" + s1.age + "--" + s1.telephone);
		
		
		Assignment s2 = new Assignment("Rim1", "Luss1", "Rim.Luss1@gmail.com", "French1", "Math1", 201, 111111110);
		System.out.println(s2.firstname + "--" + s2.lastname + "--" + s2.email + "--" + s2.school + "--" + s2.subject + "--" + s2.age + "--" + s2.telephone);
		
		Assignment s3 = new Assignment("Rim3", "Luss3", "Rim.Luss3@gmail.com", "French3", "Math3", 20, 111111113);
		System.out.println(s3.firstname + "--" + s3.lastname + "--" + s3.email + "--" + s3.school + "--" + s3.subject + "--" + s3.age + "--" + s3.telephone);

	}
		
		public Assignment(String firstname, String lastname, String email, String school, String subject, int age, int telephone) {
			
			 this.firstname = firstname;
			 this.lastname = lastname;
			 this.email = email;
			 this.school = school;
			 this.subject = subject;
			 this.age = age;
			 this.telephone = telephone;
			 
			
		}
	}


