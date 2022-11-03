package FourthWeek.SalaryCalculator;

public class Employee {

    // Initializing fields/ attributes
    private final String name;
    private final double salary;
    private final int workHours;
    private final int hireYear;


    // Initializing constructor
    public Employee(String name, double salary,int workHours,int hireYear){
        this.name = name;
        this.salary= salary;
        this.workHours= workHours;
        this.hireYear = hireYear;
    }

    //  It will calculate the tax applied to the salary.
    public double tax(){
        if (salary <= 0){
            throw new IllegalArgumentException("Salary Cannot Be Negative Or Zero");
        }
        if (salary< 1000)
            return 0;
        else
            return (salary*3)/100;
    }


    // calculate bonus salary depend on working hours
    public double bonus(){
        if (workHours > 40)
            return 30*(workHours-40);
        else
            return 0;
    }

    // raise salary depend on experience
    public double raiseSalary(){
        // current year is 2021
        int experience = 2021-hireYear;

        if ( (experience<0) || (experience==0)){
            return 0;
        }
        else if (experience<= 9){
            return salary/20;
        }
        else if (experience<=19)
        {
            return salary/10;
        }
        else
            return (salary*3)/20;


    }

    //It will print the information of the employee to the screen
    @Override
    public String toString() {
        return "Name: "+name+"\n"
                +"Salary: "+salary+"\n"
                +"Working Hours: "+workHours+"\n"
                +"Starting Year: "+hireYear+"\n"
                +"Tax: "+tax()+"\n"
                +"Bonus: "+bonus()+"\n"
                +"Salary Increase: "+raiseSalary()+"\n"
                +"Salary with Taxes and Bonuses: "+(salary+bonus()-tax())+"\n"
                +"Total Salary: "+ (salary+raiseSalary());
    }
}
class Main{
    public static void main(String[] args) {
        Employee employee = new Employee("kemal",2000.0,45,1985);
        System.out.println(employee);
    }
}
