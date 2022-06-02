package uz.pdp.appclickupmy.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.pdp.appclickupmy.entity.template.AbsEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Status extends AbsEntity {

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String color;

    @ManyToOne
    private Space space;

    @ManyToOne
    private Project project;

    @ManyToOne
    private Category category;

    @Column(nullable = false)
    private String type; //OPEN, CUSTOM, CLOSED

}
