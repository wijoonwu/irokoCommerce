package finalproject.jpnshop.web.dto;

import finalproject.jpnshop.biz.domain.Member;
import finalproject.jpnshop.biz.domain.properties.Gender;
import java.util.Date;
import lombok.Getter;

@Getter
public class ReqMember {
    private Long id;
    private String username;
    private String password;
    private String email;
    private Gender gender;
    private Date birthInfo;
    private String role;

    public Member toEntity() {
        return new Member(id, username, password, email, gender, birthInfo, role);
    }

    @Override
    public String toString() {
        return "ReqMember{" +
            "id=" + id +
            ", username= " + username +
            ", password= " + password +
            ", email= " + email +
            ", gender= " + gender +
            ", birthInfo= " + birthInfo +
            ", role= " + role + '}';
    }
}
