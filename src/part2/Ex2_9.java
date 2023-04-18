package part2;

public class Ex2_9 {
    //psvm  자동완성
    public static void main(String[] args) {
        Employee employee = new Employee("0001", "홍길동", "메가");
        System.out.println(employee);
    }
}


class Employee{
    private String id;
    private String name;
    private String department;

    public Employee() {
    }

    public Employee(String id){
        this.id = id;
        System.out.println("employee(id) 호출");
    }

    public Employee(String id,String name){
        //this.id = id;
        this(id);
        this.name = name;
        System.out.println("employee(id,name) 호출");
    }

    public Employee(String id,String name,String department){
        //this.id = id;
        this(id,name);
        this.department = department;
        System.out.println("employee(id,name,department) 호출");
    }

}



