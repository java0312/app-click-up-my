package uz.pdp.appclickupmy.entity;


import lombok.Data;
import lombok.EqualsAndHashCode;
import uz.pdp.appclickupmy.entity.template.AbsEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.sql.Timestamp;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class TimeTracked extends AbsEntity {

    @ManyToOne
    private Task task;

    @ManyToOne
    private User user;

    private Timestamp startedAt;

    private Timestamp stoppedAt;

}
