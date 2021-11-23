package Lesson_5;

public class Worker {


    private String name;
    private String pozition;
    private String email;
    private String  fone;



    private int salary;
    private int age;

   public Worker(String name, String pozition, String email, String fone, int  salary, int age){
       this.name = name;
       this.pozition = pozition;
       this.email = email;
       this.fone = fone;
       this.salary = salary;
       this.age = age;
       infoWorkers();
   }


   public  void infoWorkers(){
       System.out.println("Имя : " +name);
       System.out.println("Должность : " + pozition);
       System.out.println("Почта : " + email);
       System.out.println("Телефон : " + fone);
       System.out.println("Зарплата : " + salary);
       System.out.println("Возврат : " + age);
       System.out.println();
       System.out.println();
   }
    public String getName() {
        return name;
    }

    public String getPozition() {
        return pozition;
    }

    public String getEmail() {
        return email;
    }

    public String getFone() {
        return fone;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

}
