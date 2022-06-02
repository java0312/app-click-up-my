package uz.pdp.appclickupmy.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.pdp.appclickupmy.entity.template.AbsEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Project extends AbsEntity {

    @Column(nullable = false)
    private String name;

    @ManyToOne
    private Space space;

    @Column(nullable = false)
    private String accessType;

    @ManyToOne
    private Icon icon;

    private boolean archived;

    @Column(nullable = false)
    private String color;

}
