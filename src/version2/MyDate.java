package version2;

public class MyDate {

    private int day;
    private int month;

    private int year;


    public MyDate() {
        day = 0;
        month = 0;
        year = 0;
    }

    public MyDate(int day, int month) {
        this.day = day;
        this.month = month;
        year = 0;
    }

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day < 1 || day > 31) {
            this.day = 1;
        } else {
            this.day = day;
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month < 1 || month > 12) {
            this.month = 1;
        } else {
            this.month = month;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year < 1930 || year > 2026) {
            this.year = 2000;
        } else {
            this.year = year;
        }
    }

    @Override
    public String toString(){
        return String.format("%02d/%02d/%02d",day,month,year);
    }
}
