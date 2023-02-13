import java.util.Calendar;

/**
 * First, a single, very descriptive sentence describing the class.
 * Then, additional lines of description to elaborate the details if necessary.
 *
 * @author Ishaan Keswani, Akhil Thalasila
 */
public class Date implements Comparable<Date> {
    private int year;
    private int month;
    private int day;

    private String inDate;

    private static final int JAN = 1;
    private static final int FEB = 2;
    private static final int MAR = 3;
    private static final int MAY = 5;
    private static final int JUL = 7;
    private static final int AUG = 8;
    private static final int OCT = 10;
    private static final int DEC = 12;

    private static final int MINY = 1923;
    private static final int MAXY = 2023;
    private static final int MINDINM = 1;
    private static final int MAXDINM = 31;
    private static final int DINM = 30;
    private static final int DINLM = 29;

    private static final int QUADRENNIAL = 4;
    private static final int CENTENNIAL = 100;
    private static final int QUATERCENTENNIAL = 400;

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

    public boolean isValid() {
        // check if a date is a valid calendar date
        boolean validBounds = this.withinBounds();
        boolean validDay = this.beforeToday();
        boolean validDinM = this.daysInMonth();

        if (validBounds && validDay && validDinM)
            return true;
        else
            return false;
    }

    private boolean withinBounds() {
        if (this.year < MINY || this.year > MAXY) {
            return false;
        }
        if (this.month > DEC || this.month < JAN) {
            return false;
        }
        if (this.day > MAXDINM || this.day < MINDINM) {
            return false;
        }
        return true;
    }

    private boolean beforeToday() {
        if (this.year < MINY || this.year > MAXY) {
            return false;
        }
        if (this.month > DEC || this.month < JAN) {
            return false;
        }
        if (this.day > MAXDINM || this.day < MINDINM) {
            return false;
        }
        return true;
    }

    private boolean daysInMonth() {
        if (this.day == MAXDINM) {
            if (this.month != JAN && this.month != MAR && this.month != MAY && this.month != JUL && this.month != AUG
                    && this.month != OCT && this.month != DEC) {
                return false;
            }
        }
        if (this.day == DINM) {
            if (this.month == FEB) {
                return false;
            }
        }
        if (this.day == DINLM && this.month == FEB) {
            return this.leapCheck();
        }
        return true;
    }

    private boolean leapCheck() {
        if (this.year % QUADRENNIAL == 0) {
            if (this.year % CENTENNIAL == 0) {
                if (this.year % QUATERCENTENNIAL == 0) {
                    return true;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
        return false;
    }

    public boolean checkSixteen() {
        int validAge = 16;
        Date today = new Date();
        today.year = today.year - validAge;

        if (this.compareTo(today) <= 0)
            return true;
        return false;
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

    @Override
    public String toString() {
        String MandD = "";
        String pad = "0";

        if (this.month < 10)
            MandD += pad + this.month + "/";
        else
            MandD += this.month + "/";
        if (this.day < 10)
            MandD += pad + this.day;
        else
            MandD += this.day;
        return MandD + "/" + this.year;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Date) {
            Date date = (Date) obj;
            boolean newMonth = date.month == this.month;
            boolean newDay = date.day == this.day;
            boolean newYear = date.year == this.year;
            return (newMonth && newDay && newYear);
        }
        return false;
    }

    // CHECK THIS
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