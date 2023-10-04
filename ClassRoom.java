public class ClassRoom {
	int noOfRooms;
	int noOfStudents;
	int noOfTeachers;
	
	ClassRoom(int noOfRooms,int noOfStudents,int noOfTeachers){
		this(noOfRooms,noOfStudents);
		this.noOfTeachers = noOfTeachers;
	}
	
	ClassRoom(int noOfRooms,int noOfStudents){
		this(noOfRooms);
		this.noOfStudents = noOfStudents;
	}
	
	ClassRoom(int noOfRooms){
		this.noOfRooms = noOfRooms;
	}
	
	public static void main(String [] args){
		
		ClassRoom cr = new ClassRoom(5,50);
		ClassRoom cr1 = new ClassRoom(6);
		
		
		if(cr!=null && cr1!=null){
			System.out.println("Number of classrooms:"+ cr.noOfRooms);
			System.out.println("Number of Students:"+ cr.noOfStudents);
			System.out.println("Number of teachers:"+ cr.noOfTeachers);
			
			System.out.println("-----------------------------------------------------");
			
			System.out.println("Number of classrooms:"+ cr1.noOfRooms);
			System.out.println("Number of Students:"+ cr1.noOfStudents);
			System.out.println("Number of teachers:"+ cr1.noOfTeachers);
		}
	}
	
}