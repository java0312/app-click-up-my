package uz.pdp.appclickupmy.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.Columns;
import org.springframework.security.core.userdetails.UserDetails;
import uz.pdp.appclickupmy.entity.template.AbsEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity(name = "users")
public class User extends AbsEntity {

    @Column(nullable = false)
    private String fullName;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String color;

    @Column(nullable = false)
    private String initialLetter;

    @ManyToOne
    private Attachment avatar;

    private boolean enabled;

}
