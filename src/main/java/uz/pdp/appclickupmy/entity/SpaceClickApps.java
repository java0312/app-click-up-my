package uz.pdp.appclickupmy.entity;


import lombok.Data;
import lombok.EqualsAndHashCode;
import uz.pdp.appclickupmy.entity.template.AbsEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class SpaceClickApps extends AbsEntity {

    @ManyToOne
    private Space space;

    @ManyToOne
    private ClickApps clickApps;

}
