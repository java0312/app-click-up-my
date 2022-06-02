package uz.pdp.appclickupmy.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.pdp.appclickupmy.entity.enums.Permission;
import uz.pdp.appclickupmy.entity.template.AbsEntity;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class WorkSpacePermission extends AbsEntity {

    @ManyToOne
    private WorkSpaceRole workSpaceRole;

    @Enumerated(EnumType.STRING)
    private Permission permission;

}
