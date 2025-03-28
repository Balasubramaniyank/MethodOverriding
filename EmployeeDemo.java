class empolyee{

  String name;
  int id;
   
  public empolyee(String name , int id){

    this.id=id;
    this.name=name;
   }

  public  void display(){

   System.out.println("Empolyee Name "+name);
   System.out.println("Empolyee Id "+id );

    }
  
}

class hourlyEmpolyee extends empolyee{

  double hourlyRate;

  int hour;

    public hourlyEmpolyee(String name, int id, double hourlyRate, int hour) {
        super(name, id);
        this.hour=hour;
        this.hourlyRate=hourlyRate;
    }
 
   public void display(){

       super.display();
          
          System.out.println("Empolyee Salary "+hour*hourlyRate);

   }

}

class SalaryEmpo extends  empolyee{

  double Salary;

   SalaryEmpo(String name, int id , double  Salary){

    super(name, id);
    this.Salary=Salary;
   }

 public void display(){

     super.display();
      System.out.println("Empolyee Salary "+Salary);

 }

}

public class EmployeeDemo{

    
    public static void main(String[] args) {
        
        hourlyEmpolyee bala = new hourlyEmpolyee("bala", 003, 9000, 7);
        SalaryEmpo  mugesh = new SalaryEmpo("Mugesh", 017, 40000);

        bala.display();
        System.out.println();
        mugesh.display();


    }

    
}