public class Roster {
    private Student[] roster;
    private int size;

    // CHECK THIS placeholder, incomplete
    int test;

    private int find(Student student) {
        for (int i = 0; i < this.size; i++) {
            if (this.roster[i].equals(student)) {
                return i;
            }
        }
        // search given student in roster
        return -1;
    }

    private void grow() {
        // grow main array by 4
        Student[] newProf = new Student[this.size + 4];
        for (int i = 0; i < this.size; i++) {
            newProf[i] = this.roster[i];
        }
        this.size += 4;
        // make a new array with a size greater by 4 and add everything to it (O(n))
    }

    public boolean add(Student student) {
        // add student to end of array
        return false;
    }

    public boolean remove(Student student) {
        int pos = this.find(student);
        if (pos == -1) {
            return false;
        }
        for (int i = pos; i < this.size - 1; i++) {
            this.roster[i] = this.roster[i + 1];
        }
        this.size -= 1;
        // remove given student from the array while maintaining order
        // use find method to find the int location of the student, remove it, make all
        // the others come to the previous and return
        return true;
    }

    public boolean contains(Student student) {
        for (int i = 0; i < this.size; i++) {
            if (this.roster[i].equals(student)) {
                return true;
            }
        }
        return false;
        // checks to see if the array contains the given student
    }

    public void print() {
        // print roster sorted by profiles
    }

    public void printBySchoolMajor() {
    } // print roster sorted by school major

    public void printByStanding() {
        // print roster sorted by standing
    }
}