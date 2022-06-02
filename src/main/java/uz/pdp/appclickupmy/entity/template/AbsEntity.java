package uz.pdp.appclickupmy.entity.template;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;
import uz.pdp.appclickupmy.entity.User;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.UUID;

@Data
@MappedSuperclass
public class AbsEntity {

    @Id
    @GeneratedValue
    private UUID id;

    @JoinColumn(updatable = false)
    @CreatedBy
    @ManyToOne(fetch = FetchType.LAZY)
    private User createdBy;

    @LastModifiedBy
    @ManyToOne(fetch = FetchType.LAZY)
    private User updatedBy;

    @CreationTimestamp
    private Timestamp createdAt;

    @UpdateTimestamp
    private Timestamp updatedAt;



}
