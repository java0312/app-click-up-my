package uz.pdp.appclickupmy.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import uz.pdp.appclickupmy.entity.template.AbsEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class TaskAttachment extends AbsEntity {

    @Column(nullable = false)
    private String name;

    @ManyToOne
    private Task task;

    @ManyToOne
    private Attachment attachment;

    @ManyToOne
    private Attachment pinCoverAttachment;

}
