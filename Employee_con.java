class Employee_con {


    private Integer id;
    private String name;
    private Double saraly;

    // การใช้งาน static 
    // static คือ ไม่ต้องสร้าง Object ขึ้นมารอ สามารถเรียกใช้งานได้เลย ไม่ต้องสร้าง Object มาลองรับ
    public static Double minSaraly=12000.0;

    // Constructor
    public Employee_con() {
        this.id=1;
        this.name="test";
        this.saraly=0.0;
    }


    public  Employee_con(Integer id, String name, Double saraly) {
        this.id=id;
        this.name=name;
        this.saraly=saraly;
    }

    // Desplay data to console
    public void displayEmployee() {
        System.out.println("=============================================");
        System.out.println("ID = "+this.id);
        System.out.println("Name = "+this.name);
        System.out.println("Saraly = "+this.saraly);
    }
}