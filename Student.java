/**
 * First, a single, very descriptive sentence describing the class.
 * Then, additional lines of description to elaborate the details if necessary.
 *
 * @author Ishaan Keswani, Akhil Thalasila
 */
public class Student {
    private Profile profile;
    private Major major; // Major is an enum type

    // CHECK THIS incomplete
    private int creditCompleted;

    public Student(Profile profile, Major major, int credit) {
        this.profile = profile;
        this.major = major;
        this.creditCompleted = credit;
    }

    public Student(Profile profile) {
        this.profile = profile;
        this.major = Major.CS;
        this.creditCompleted = 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student inStudent = (Student) obj;
            if ((this.profile.equals(inStudent.profile)) && this.major == inStudent.major) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        String res = this.profile.toString();
        res += this.major;
        res += String.valueOf(this.creditCompleted);
        return res;
    }

    // CHECK THIS missing toString, compareTo methods
    // public Student compareTo(Student i) {
    //
    // return "";
    // }
    // CHECK THIS missing get methods
    public Profile getProfile() {
        return this.profile;
    }

    public int getCreditCompleted() {
        return this.creditCompleted;
    }

    public boolean setMajor(Major maj) {
        if (validMaj(maj)) {
            this.major = maj;
            return true;
        }
        return false;
    }

    public boolean validMaj(Major maj) {
        if (maj.equals("CS") || maj.equals("BAIT") || maj.equals("ITI") || maj.equals("EE") || maj.equals("MATH")) {
            return true;
        }
        System.out.println("invalid major");
        return false;
    }
}