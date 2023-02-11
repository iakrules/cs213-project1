import java.util.Calendar;

/*
 * 
 * @author Ishaan Keswani
 * @author 
 * 
 */

public class Date implements Comparable<Date> {
    private int year;
    private int month;
    private int day;

    private String inDate;

    public Date() {
        // create an object with today’s date (see Calendar class)
        Calendar now = Calendar.getInstance();
        this.year = now.get(Calendar.YEAR);
        this.month = ((now.get(Calendar.MONTH)) + 1);
        this.day = now.get(Calendar.DAY_OF_MONTH);
    }

    public Date(String date) {
        // take “mm/dd/yyyy” and create a Date object
        String inDate[] = date.split("/");
        this.month = Integer.parseInt(inDate[0]);
        this.day = Integer.parseInt(inDate[1]);
        this.year = Integer.parseInt(inDate[2]);
        this.inDate = date;
    }

    // CHECK THIS missing isValid idk how to do this part in code
    public boolean isValid() {
        // check if a date is a valid calendar date
        return true;
    }

    public int getYear() {
        return this.year;
    }

    public int getMonth() {
        return this.month;
    }

    public int getDay() {
        return this.day;
    }

    public String getDateString() {
        return this.inDate;
    }

    // CHECK THIS missing toString, equals methods
    @Override
    public int compareTo(Date newDate) {
        if (this.year > newDate.year) {
            return 1;
        } else if (this.year == newDate.year) {
            if (this.month > newDate.month) {
                return 1;
            } else if (this.month == newDate.month) {
                if (this.day > newDate.day) {
                    return 1;
                } else if (this.day == newDate.day) {
                    return 0;
                }
            }
        }
        return -1;
    }
}