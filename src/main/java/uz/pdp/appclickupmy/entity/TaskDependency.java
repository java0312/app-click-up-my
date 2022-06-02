package uz.pdp.appclickupmy.entity;


import lombok.Data;
import lombok.EqualsAndHashCode;
import uz.pdp.appclickupmy.entity.enums.DependencyType;
import uz.pdp.appclickupmy.entity.template.AbsEntity;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class TaskDependency extends AbsEntity {

    @ManyToOne
    private Task task;

    @ManyToOne
    private Task dependencyTask;

    @Enumerated(EnumType.STRING)
    private DependencyType dependencyType;



}
