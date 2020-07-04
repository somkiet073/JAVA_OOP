/**
 * Employee
 */
class Employee {

    // Attribute
    private String id;
    private String name;
    private Double saraly;
    
    // การกำหนด Default Constructor
    // คือการกำหนดค่าตั้งต้นให้กับ Class นั้นๆ

    public Employee(String name, Double saraly) {
        this.name = name;
        this.saraly = saraly;
        this.displayEmployee();
    }

    public Employee() {

        this.id="1";
        this.name="Somkiet";
        this.saraly=30000.0;
        System.out.println("Create Object Complete");
    }
    
    // การทำ Gettter & Setter Method
    // Setter Method
    public void setId(String id){
        this.id=id;
    }

    public void setName(String name) {
        this.name=name;
    }

    public void setSaraly(Double saraly) {
        this.saraly=saraly;
    }

    // Desplay data to console
    public void displayEmployee() {
        System.out.println("ชื่อ: "+this.name);
        System.out.println("เงินเดือน: "+this.saraly);
    }

    // การทำ Getter Method
    public String getName() {
        return this.name;
    }

    public Double getSaraly() {
        return this.saraly;
    }
}