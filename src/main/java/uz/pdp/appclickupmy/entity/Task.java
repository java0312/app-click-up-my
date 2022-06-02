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
public class Task extends AbsEntity {

    private String name;

    @OneToOne
    private Status status;

    private String description;

    @ManyToOne
    private Category category;

    @ManyToOne
    private Priority priority;

    @ManyToOne
    private Task parentTask;

    private Date startedDate;

    private Time startedTimeHas;

    private Date dueDate;

    private Time dueTimeHas;

    private Time estimateTime;

    private boolean archivedDate;

}
