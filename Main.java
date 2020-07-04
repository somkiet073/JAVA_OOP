/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        // ==================================== Getter & Setter ===============================================

        Employee emp = new Employee(); // Create Object1
        emp.setId("1"); //Assign
        emp.setName("John");
        emp.setSaraly(15000.00);
        System.out.println("-------------------------------------");
        System.out.println("Employee1");
        System.out.println("My name is "+emp.getName());
        System.out.println("Saraly is " + emp.getSaraly());
        //emp1.displayEmployee();

        System.out.println("-------------------------------------");

        Employee emp2 = new Employee(); // Create Object2
        emp2.setId("2");
        emp2.setName("Somluk");
        emp2.setSaraly(25000.00); 
        System.out.println("Employee2");
        System.out.println("My name is "+emp2.getName());
        System.out.println("Saraly is " + emp2.getSaraly());
        System.out.println("-------------------------------------");
        emp2.displayEmployee();

        // ==================================== Constructor ==================================================

        System.out.println("------------------- Constructor ------------------");
        Employee_con emc = new Employee_con(1, "Somkiet", 25000.0);
        emc.displayEmployee();
        Employee_con emc2 = new Employee_con();
        emc2.displayEmployee(); 

        // ========================================== Static ====================================================
        double rs = Employee_con.minSaraly;
        System.out.println(rs);

        // ==================================== Static Company ==================================================
        String res = Company.getCompany();
        String res2 = Company.create_att;
        System.out.println(res);
        System.out.println(res2);

        // ===================================== Inheritance ==================================================
        System.out.println("------------------- Inheritance ------------------");
        System.out.println("-------------- sub Class Programmer ------------------");
        Programmer p1 = new Programmer("name", 12000.0);
        p1.setId("1");
        p1.setName("Somkiet lnwza");
        p1.setSaraly(35000.0);
        p1.setProgrammer();
        p1.displayEmployee();

        System.out.println("-------------- sub Class Accountting ------------------");
        Accountting p2 = new Accountting("name2", 12000.0);
        p2.setId("1");
        p2.setName("Somkiet lnwza");
        p2.setSaraly(35000.0);
        p2.setAccountting();
        p2.displayEmployee();

    }
}