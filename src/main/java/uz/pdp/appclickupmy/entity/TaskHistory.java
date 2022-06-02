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
public class TaskHistory extends AbsEntity {

   @ManyToOne
    private Task task;

   @Column(nullable = false)
   private String changeFieldName;

    @Column(nullable = false)
   private String before;

    @Column(nullable = false)
   private String after;

    @Column(nullable = false)
   private String data;

}
