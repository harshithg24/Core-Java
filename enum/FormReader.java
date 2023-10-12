public class FormReader{
	public static void main(String [] args){
		Form form = new Form(Days.MONDAY,Months.MARCH,Season.SUMMER,IdProof.PAN_CARD,WorkType.EMPLOYED,PaymentMethod.CASH,Food.VEG,Gender.MALE,Graduation.UNDER_GRADUATION,CovidVaccine.VACCINATED,ProfessionType.BUSINESS,Classes.GOLD_CLASS,Nationality.INDIAN,Result.PASS,Age.ABOVE_EIGHTEEN);
		 
		 if(form!=null){
			 form.formDetails();
		 }
	}
}