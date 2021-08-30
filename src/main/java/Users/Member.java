package Users;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Member {
    @Id
    private int mid;
    private String name;
    private String email;
    @Column(name = "phone")
    private String phoneNumber;

//    Default Constructor
    public Member() {
    }

    public Member(int mid, String name, String email, String phoneNumber) {
        this.mid = mid;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
