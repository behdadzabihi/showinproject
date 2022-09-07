package krd.kurdestansoft.showin.like;

import krd.kurdestansoft.showin.common.BaseEntity;
import krd.kurdestansoft.showin.place.Place;
import krd.kurdestansoft.showin.user.UserApp;
import lombok.Data;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "tbl_like",uniqueConstraints = {@UniqueConstraint(columnNames = {"user_id","place_id"})})
@Data
@Audited
public class Like extends BaseEntity {

    @NotNull
    private Boolean isFavorite;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserApp userApp;

    @ManyToOne
    @JoinColumn(name = "place_id")
    private Place place;


}
