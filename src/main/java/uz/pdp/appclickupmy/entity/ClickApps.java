package uz.pdp.appclickupmy.entity;


import lombok.Data;
import lombok.EqualsAndHashCode;
import uz.pdp.appclickupmy.entity.template.AbsEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class ClickApps extends AbsEntity {

    private String name;

    @ManyToOne
    private Icon icon;

}
