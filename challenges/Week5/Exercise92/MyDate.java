
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int montd, int year) {
        this.day = day;
        this.month = montd;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    public int differenceInYears(MyDate comparedDate) {
        double yearDiff = 0.00;

        double year = this.year + (double) this.month/12 + (double) this.day/365;

        double comparedYear = comparedDate.year + (double) comparedDate.month/12 + (double) comparedDate.day/365;

        if (this.year > comparedDate.year) {
            yearDiff = year - comparedYear;
        }else {
            yearDiff = comparedYear - year;
        }
        return (int) yearDiff;
     }

}
