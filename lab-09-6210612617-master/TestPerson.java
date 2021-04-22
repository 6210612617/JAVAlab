/**
 *
 * @author Nitcharee Khatkhanangchanan <6210612617@cn103>
 */
public class TestPerson {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person("James", "United Kingdom", "007", "007@UK");
        Student s1 = new Student();
        Student s2 = new Student("sophomore");
        Employee e1 = new Employee();
        Employee e2 = new Employee(15000);
        Faculty f1 = new Faculty();
        Faculty f2 = new Faculty("9:00 - 17:00");
        Staff st1 = new Staff();
        Staff st2 = new Staff("Secretary");

        p2.setName("James Bond");
        p2.setAddress("UK");
        p2.setPhone("44-007");
        p2.setEmail("james@mi6.gov.uk");

        s2.setName("xxxxxxxxxx");
        s2.setAddress("cn103");
        s2.setPhone("xxxxxx");
        s2.setEmail("xxxxxxxxxx@cn103");

        e2.setSalary(16000);

        f2.setOfficeHour("7:00 - 15:00");

        st2.setPosition("Head of Human Resource");

        System.out.println("Person: " + p2.getName() + " " + p2.getAddress() +
                " " + p2.getPhone() + " " + p2.getEmail() );
        System.out.println("Student: " + s2.getName() + " " + s2.getStatus() );
        System.out.println("Employee: " + e2.getSalary() );
        System.out.println("Faculty: " + f2.getOfficeHour() );
        System.out.println("Staff: " + st2.getPosition() );
    }
}

