public class CheckEnumRead{
	public static void main(String [] args){
		
		CheckEnum ce = new CheckEnum(Vaccine.VACCINATED,RectSides.FOUR,SemYear.TWO_THOUSAND_TWENTY,PetrolDensity.SEVENTYSEVEN_POINT_ZEROFOUR,Grade.A);
		
		CheckEnumRead.CheckVaccine(ce);
		
		CheckEnumRead.CheckSides(ce);
		
		CheckEnumRead.CheckYear(ce);
		
		CheckEnumRead.CheckDensity(ce);
		
		CheckEnumRead.CheckGrade(ce);
	}
		
		public static void CheckVaccine(CheckEnum ce){
			if(ce.vac.value =="vaccinated"){
				System.out.println("You are safe");
			}
			else{
				System.out.println("You are not safe");
			}
		}
		
		public static void CheckSides(CheckEnum ce){
			if(ce.side.value ==4){
				System.out.println("It has 4 sides");
			}
			else if(ce.side.value ==3){
				System.out.println("It is not having 3 sides");
			}
			else if(ce.side.value ==2){
				System.out.println("It is not having 2 sides");
			}
			else{
				System.out.println("It is not having 1 sides");
			}
		}
		
		public static void CheckYear(CheckEnum ce){
			if(ce.sem.value ==2019){
				System.out.println("First year");
			}
			else if(ce.sem.value ==2020){
				System.out.println("Second year");
			}
			else if(ce.sem.value ==2021){
				System.out.println("Third year");
			}
			else{
				System.out.println("Fourth year");
			}
			
		}
		
		public static void CheckDensity(CheckEnum ce){
		if(ce.pd.value ==77.04f){
				System.out.println("Good Density");
			}
			else {
				System.out.println("Not having good density");
			}
		}
		
		public static void CheckGrade(CheckEnum ce){
		if(ce.gra.value =='A'){
				System.out.println("Good");
			}
			else if(ce.gra.value =='B'){
				System.out.println("Average");
			}
			else if(ce.gra.value =='C'){
				System.out.println("Work hard");
			}
		}
		
		
}		
	
