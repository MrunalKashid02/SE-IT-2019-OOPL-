// Name - Mrunal Kashid
// Roll No- 23238
// Batch - F10
import java.util.Scanner;
//Assignment no. 2 Inherritance
// Parent class employee
class employee {
    int emp_id;
    double basic_pay;
    String emp_mno, emp_name, mail, emp_type, address;
    double da, hra, pf, club_fund, gross, net;
    Scanner sc = new Scanner(System.in);
// Validation checks unique id of employee

int checkempid (employee e[],int j) {
    int id; // input trials
    while (true) {
        System.out.println("Enter emp id: ");
        id = sc.nextInt();
      //  int i;
        for (int i = 0; i < j; i++) {
            if (e[i].emp_id == id) {
                System.out.println("Same id for multiple employees is not allowed");
                break;
            }
            if (i == j) {
                break;
            }
        }
        return id;
    }

}

//Validation checks if number consists of 10 digits//

String checkEmpmno(){
    String mno ;
    while(true){
        System.out.println("Enter mobile no:");
        mno = sc.nextLine();
        if(mno.length() != 10 ){
            System.out.println("Please enter the valid number");
        }
        else{
            break;
        }
    }
    return mno;
}

//Reads data from user
void getdata(employee emp1[], int j){
//   sout//
    emp_id= checkempid(emp1, j);
    sc.nextLine();
    System.out.println("Enter employee name");
    emp_name = sc.nextLine();
    emp_mno= checkEmpmno();
    System.out.println("Enter your mail id:" );
    mail = sc.nextLine();
    System.out.println("Enter your address");
    address = sc.nextLine();
    //sout//
}

// Calculate salary components//
void cal_salary(double basic_pay){
    da = basic_pay*0.97;
    hra = basic_pay*0.1;
    pf = basic_pay*0.12;
    club_fund = basic_pay*0.001;
    gross = basic_pay+da+hra;
    net = gross-pf-club_fund;
}

//Display user details//

void displayDetails(){
    System.out.println("----------------------------------");
    System.out.println("Employee details");
    System.out.println("Name: "+ emp_name);
    System.out.println("ID "+ emp_id);
    System.out.println("Mobile number "+ emp_mno);
    System.out.println("mail "+ mail);
    System.out.println("Address "+ address);
    System.out.println("----------------------------------");
}


// Display salary component//
void displaySalary(String emp_type){
    System.out.println( );
    System.out.println("----------------------------------");
    System.out.println("Salary Slip of " + emp_type );
    System.out.println("Basic Pay "+ basic_pay);
    System.out.println("DA "+ da);
    System.out.println("HRA "+hra);
    System.out.println("PF "+pf);
    System.out.println("Club Fund "+ club_fund);
    System.out.println("Gross salary "+ gross);
    System.out.println("Net salary "+net);
    System.out.println("----------------------------------");
  }
}

// Programmer class
 class Programmer extends employee{
    void bp_Programmer(employee a){
        System.out.println("Enter the basic pay of programmer !");
        basic_pay = sc.nextDouble();
        cal_salary(basic_pay);
        emp_type = "PROGRAMMER";
        a.displayDetails();
        displaySalary(emp_type);
    }
}

//Team lead class
 class TeamLead extends employee{
    void bp_TeamLead(employee a){
        System.out.println("Enter the BAsic pay of team lead  ");
        basic_pay= sc.nextDouble();
        cal_salary(basic_pay);
        a.displayDetails();
        displaySalary(emp_type);
    }
}
// Assistant project manager~~~~~~
class AssistantProjectManager extends employee{
    void bp_AssistantProjectManager(employee a){
        System.out.println("Enter Basic pay of Assistant project manger");
        basic_pay = sc.nextDouble();
        cal_salary(basic_pay);
        emp_type="Assistant Manger";
        a.displayDetails();
        displaySalary(emp_type);
    }
}
class ProjectManager extends employee{
    void bp_ProjectManager(employee a ){
        System.out.println("Enter basic pay of Project Manager");
        basic_pay=sc.nextDouble();
        cal_salary(basic_pay);
        emp_type="Project Manager";
        a.displayDetails();
        displaySalary(emp_type);
    }
}

public class salary_slip {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of employee");
        int number_emp = sc.nextInt();
        employee e1[]= new employee[number_emp];
        for (int i=0; i<number_emp;i++ ){
            e1[i] = new employee();
            e1[i].getdata(e1,i);
            int flag =0;
            while (flag ==0 ){
                int choice;
                System.out.println("Select the type of employee~~\n1 for programmer: \n2 for team Lead:\n3 For Assistant Project manager:\n4 Project manager ");
                choice = sc.nextInt();
                switch (choice){
                    case 1:
                        Programmer p = new Programmer();
                        p.bp_Programmer(e1[i]);
                        flag = 1;
                        break;
                    case 2 :
                        TeamLead t1 = new TeamLead();
                        t1.bp_TeamLead(e1[i]);
                        flag=1;
                        break;
                    case 3 :
                        AssistantProjectManager apm = new AssistantProjectManager();
                        apm.bp_AssistantProjectManager(e1[i]);
                        flag =1 ;
                        break;
                    case 4 :
                        ProjectManager jk = new ProjectManager();
                        jk.bp_ProjectManager(e1[i]);
                        flag = 1;
                        break;
                    default:
                        System.out.println("Invalid Choice!!");

                }

            }
        }
sc.close();



    }
}