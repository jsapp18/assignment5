import java.util.GregorianCalendar;

public class MyDate{
    //Variables
    private int year;
    private int month; //starts at 0
    private int day;


    //Makes a date for current day
    MyDate(){
        GregorianCalendar current_date = new GregorianCalendar();
        year = current_date.get(GregorianCalendar.YEAR);
        month = current_date.get(GregorianCalendar.MONTH);
        day = current_date.get(GregorianCalendar.DAY_OF_MONTH);
    }

    //Creates a date from a specified time
    MyDate(long elapsedTime){
        setDate(elapsedTime);
    }


    //Same as MyDate() but you specify the date
    MyDate(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    //gets the year
    public int getYear(){
        return year;
    }

    //gets the month
    public int getMonth(){
        int real_month = month + 1;
        return real_month;
    }

    //gets the day
    public int getDay(){
        return day;
    }

    //sets a date using the time
    public void setDate(long elapsedTime){
        GregorianCalendar date_setter = new GregorianCalendar();
        date_setter.setTimeInMillis(elapsedTime);
        year = date_setter.get(GregorianCalendar.YEAR);
        month = date_setter.get(GregorianCalendar.MONTH);
        day = date_setter.get(GregorianCalendar.DAY_OF_MONTH);
    }
}

