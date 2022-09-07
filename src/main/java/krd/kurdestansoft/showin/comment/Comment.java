package krd.kurdestansoft.showin.comment;

import krd.kurdestansoft.showin.common.BaseEntity;
import krd.kurdestansoft.showin.place.Place;
import krd.kurdestansoft.showin.user.UserApp;
import lombok.Data;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "tbl_comment",uniqueConstraints = {@UniqueConstraint(columnNames = {"user_id","place_id"})})
@Data
@Audited
public class Comment extends BaseEntity {

    @NotNull
    @Column(name = "date")
    private Date date;


    @NotNull
    @Column(name = "message")
    private String message;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserApp userApp;

    @ManyToOne
    @JoinColumn(name = "place_id")
    private Place place;


}
