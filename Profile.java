/*
 * 
 * @author Ishaan Keswani
 * @author
 * 
 */

public class Profile implements Comparable<Profile> {
    private String lname;
    private String fname;
    private Date dob; // use the Date class described in (f)

    public Profile(String lname, String fname, Date dob) {
        this.lname = lname;
        this.fname = fname;
        this.dob = dob;
    }

    @Override
    public String toString() {
        return this.lname + "::" + this.fname + "::" + this.dob.getDateString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Profile) {
            Profile input = (Profile) obj;
            if (this.lname.equals(input.lname) && this.fname.equals(input.fname)
                    && this.dob.compareTo(input.dob) == 0) {
                return true;
            }
        }
        return false;
    }

    // CHECK THIS i think i did this wrong
    @Override
    public int compareTo(Profile newProfile) {
        if (this.lname != newProfile.lname) {
            return 1;
        } else if (this.lname == newProfile.lname) {
            if (this.fname != newProfile.fname) {
                return 1;
            } else if (this.fname == newProfile.fname) {
                if (this.dob != newProfile.dob) {
                    return 1;
                } else if (this.dob == newProfile.dob) {
                    return 0;
                }
            }
        }
        return -1;
    }

    public String getlname() {
        return this.lname;
    }

    public String getfname() {
        return this.fname;
    }

    public Date getdob() {
        return this.dob;
    }

}