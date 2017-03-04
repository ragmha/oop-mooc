import java.util.Calendar;

public class Person {

    private String name;
    private MyDate birthday;

    public Person(String name, int pp, int kk, int vv) {
        this.name = name;
        this.birthday = new MyDate(pp, kk, vv);
    }

    public Person(String name, MyDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public Person(String name) {
        this.name = name;
        Calendar now = Calendar.getInstance();

        int day = now.get(Calendar.DATE);
        int month = now.get(Calendar.MONTH)+ 1;
        int year = now.get(Calendar.YEAR);

        this.birthday = new MyDate(day,month, year);
    }


    public int age() {
        Calendar now = Calendar.getInstance();

        int day = now.get(Calendar.DATE);
        int month = now.get(Calendar.MONTH)+1;
        int year = now.get(Calendar.YEAR);

        MyDate currentDate = new MyDate(day, month, year);

        return currentDate.differenceInYears(this.birthday);
    }

    public boolean olderThan(Person compared) {
        return this.birthday.earlier(compared.birthday);
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.name + ", born " + this.birthday;
    }

}
