package Lesson_5;

public class Lesson_5 {
    public static void main(String[] args) {
        Worker worker1= new Worker("Иван Иванович", "Директор", "ИИ@компания.ру", "89265569999", 1000000, 50);
        Worker worker2= new Worker("Мария Викторовна", "Бухгалетр", "МВ@компания.ру", "89265568888", 1000000, 40);
        Worker worker3= new Worker("Денис Васильевич", "Менеджер", "ДВ@компания.ру", "89265567777", 1000000, 30);
        Worker worker4= new Worker("Виктор Эдуардович", "Разнорабочий", "ВЭ@компания.ру", "89265565555", 1000000, 20);
        Worker worker5= new Worker("Зинаида Степановна", "Уборщица", "ЗС@компания.ру", "89265564444", 1000000, 60);



        Worker[] workers = new Worker[5];
        workers[0] = new Worker("Иван Иванович", "Директор", "ИИ@компания.ру", "89265569999", 1000000, 1);
        workers[1] = new Worker("Мария Викторовна", "Бухгалетр", "МВ@компания.ру", "89265568888", 1000000, 50);
        workers[2] = new Worker("Денис Васильевич", "Менеджер", "ДВ@компания.ру", "89265567777", 1000000, 50);
        workers[3] = new Worker("Виктор Эдуардович", "Разнорабочий", "ВЭ@компания.ру", "89265565555", 1000000, 50);
        workers[4] = new Worker("Зинаида Степановна", "Уборщица", "ЗС@компания.ру", "89265564444", 1000000, 50);



for (int i = 0; i < workers.length; i++){
    if (workers[i].getAge() > 40) {
        System.out.println("Имя : " + workers[i].getName() );
        System.out.println("Должность : " + workers[i].getPozition());
        System.out.println("Почта : " + workers[i].getEmail());
        System.out.println("Телефон : " + workers[i].getFone());
        System.out.println("Зарплата : " + workers[i].getSalary());
        System.out.println("Возврат : " + workers[i].getAge());
        System.out.println();
        System.out.println();

    }
}



    }
}