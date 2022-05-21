public class Employee {
    String name;
    int salary;
    int workHouse;
    int hireYear;
    double vergi=0;
    double bonuc=0;
    double maasArtisi=0;
    Employee(String name,int salary,int workHouse,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHouse=workHouse;
        this.hireYear=hireYear;


    }
   public double tax(int salary){


        if(salary>1000){
            vergi=salary*(0.03);
             return vergi;
        }
        else
            return vergi;

        }


    public double bonus(int salary,int workHouse)
    {

        if(workHouse>40){
            bonuc=(workHouse-40)*30;
        }
        return bonuc;

    }

    public double raiseSalary(int hireYear,int salary){

        if((2021-hireYear)<10){
            maasArtisi=salary*0.05;
        }
        if((2021-hireYear)>9 &&(2021-hireYear)<20){
            maasArtisi=salary*0.10;

        }
        if((2021-hireYear)>19){

            maasArtisi=salary*0.15;
        }
        return maasArtisi;
    }


    public String toString(int salary,int hireYear,int workHouse){
        System.out.println("Adi "+name);
        System.out.println("Maasi :"+salary);
        System.out.println("Calisma Saati :"+workHouse);
        System.out.println("Baslangıc Yili :"+hireYear);
        System.out.println("Vergi :"+(tax(salary)));
        System.out.println("Bonus :"+bonus(salary,workHouse));
        System.out.println("Maas Artisi :"+raiseSalary(hireYear,salary));
        System.out.println("Vergi ve Bonus ile birlikte maas :"+(bonus(salary,workHouse)+salary-tax(salary)));
        System.out.println("Toplam Maas :"+(bonus(salary,workHouse)+raiseSalary(hireYear,salary)+salary-tax(salary)));

        return null;
    }


}
