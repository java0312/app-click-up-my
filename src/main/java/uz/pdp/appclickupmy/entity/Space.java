package uz.pdp.appclickupmy.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.pdp.appclickupmy.entity.template.AbsEntity;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Space extends AbsEntity {
    private String name;

    @OneToOne
    private WorkSpace workSpace;

    private String color;

    private String initialLetter;

    @ManyToOne
    private Icon icon;

    @ManyToOne
    private Attachment avatar;

    private String accessType;

    @ManyToOne
    private User owner;
}
