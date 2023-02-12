/*
 *
 * @author Ishaan Keswani
 * @author
 *
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

    // CHECK THIS missing toString, compareTo methods

    // CHECK THIS missing get methods
    public Profile getProfile() {
        return this.profile;
    }
}