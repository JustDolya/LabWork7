public class Main {
    public  static void main(String[] args){
        Person[] persons = {
                new Person("Иван", "Иванов", "Иванович", "ул. Пушкина 15 - 45", "Высшее", 1987),
                new Person("Мария", "Сидорова", "Олеговна", "ул. Ленина 46 - 37", "Высшее", 1992),
                new Person("Петр", "Петров", "Петрович", "ул. Революционная 16 - 15", "Средее профессиональное", 2003),
                new Person("Ольга", "Козлова", "Михайловна", "ул. Циолковского 5 - 14", "Основное общее", 2007),
                new Person("Алексей", "Никитин", "Сергеевич", "ул. Коммунистическая 32 - 43", "Среднее профессиональное", 1968)
        };
        System.out.println("Совершеннолетние к концу 2024 года:");
        for (Person person : persons){
            if (person.birthYear <= 2006){
                person.printFullName();
            }
        }
        System.out.println();
        System.out.println("Люди с высшим образованием:");
        for (Person person : persons){
            if (person.education.equals("Высшее")){
                person.printFullName();
            }
        }
    }
}
class Person {
    String name;
    String surname;
    String patronymic;
    String address;
    String education;
    int birthYear;
    Person(String name, String surname, String patronymic, String address, String education,  int birthYear) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.address = address;
        this.education = education;
        this.birthYear = birthYear;
    }
    public void printFullName(){
        System.out.printf("%s %s %s", surname, name, patronymic);
        System.out.println();
    }
}