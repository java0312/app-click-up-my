package uz.pdp.appclickupmy.entity;


import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.Columns;
import uz.pdp.appclickupmy.entity.template.AbsEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Priority extends AbsEntity {

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String color;

    @ManyToOne
    private Icon icon;

}
