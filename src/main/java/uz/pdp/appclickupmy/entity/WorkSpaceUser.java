package uz.pdp.appclickupmy.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.pdp.appclickupmy.entity.template.AbsEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class WorkSpaceUser extends AbsEntity {

    @ManyToOne
    private WorkSpaceRole workSpaceRole;

    @ManyToOne
    private User user;

    @ManyToOne
    private WorkSpace workSpace;

    private Date invitedDate;

    private Date joinedDate;

}
