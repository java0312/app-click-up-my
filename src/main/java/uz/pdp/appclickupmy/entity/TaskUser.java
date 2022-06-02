package uz.pdp.appclickupmy.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import uz.pdp.appclickupmy.entity.template.AbsEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.sql.Time;
import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class TaskUser extends AbsEntity {

    @ManyToOne
    private Task task;

    @ManyToOne
    private User user;

}
