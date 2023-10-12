public class Form{
	Days day;
	Months month;
	Season season;
	IdProof id;
	WorkType workTpe;
	PaymentMethod pay;
	Food food;
	Gender gender;
	Graduation grad;
	CovidVaccine cov;
	ProfessionType prof;
	Classes cls;
	Nationality nat;
	Result res;
	Age age;
	
	Form(Days day,Months month,Season season,IdProof id,WorkType workTpe,PaymentMethod pay,Food food,Gender gender,Graduation grad,CovidVaccine cov,ProfessionType prof,Classes cls,Nationality nat,Result res,Age age){
	this.day=day;
	this.month=month;
	this.season=season;
	this.id=id;
	this.workTpe=workTpe;
	this.pay=pay;
	this.food=food;
	this.gender=gender;
	this.grad=grad;
	this.cov=cov;
	this.prof=prof;
	this.cls=cls;
	this.nat=nat;
	this.res=res;
	this.age=age;
	}
	
	void formDetails(){
		System.out.println(day);
		System.out.println(month);
		System.out.println(season);
		System.out.println(id);
		System.out.println(workTpe);
		System.out.println(pay);
		System.out.println(food);
		System.out.println(gender);
		System.out.println(grad);
		System.out.println(cov);
		System.out.println(prof);
		System.out.println(cls);
		System.out.println(nat);
		System.out.println(res);
		System.out.println(age);
	}
}