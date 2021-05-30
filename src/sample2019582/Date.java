package sample2019582;

public class Date  {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {//these methods that are used for retrieving and updating the value of a variable.
        if (month == 2 && year % 4 == 0 && day > 29) System.out.println("Enter_A_Valid_Input_Date!");//validation 29days
        else if ((month == 2) && (day > 28)) System.out.println("Enter_A_Valid_Input_Date!");//validation 28days
        else if (((month == 7) || (month % 2 == 0)) && (day > 31)) System.out.println("Enter_A_Valid_Input_Date!");//validation 31days
        else if ((month % 2 == 1) && (day > 30)) System.out.println("Enter_A_Valid_Input_Date!");//validation 30days
        else this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if ((month > 12) || (month < 1)) System.out.println(month +"Please enter valid month!");
        else this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year < 2000 || year > 2100) {
            System.out.println("Please enter valid year!");
        }
        else this.year = year;
    }
}
