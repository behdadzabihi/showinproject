package krd.kurdestansoft.showin.file_attachment;

import krd.kurdestansoft.showin.common.BaseEntity;
import krd.kurdestansoft.showin.place.Place;
import krd.kurdestansoft.showin.user.UserApp;
import lombok.Data;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "tbl_file_attachments",uniqueConstraints = {@UniqueConstraint(columnNames = {"user_id","place_id"})})
@Data
@Audited
public class FileAttachment extends BaseEntity {

    @NotNull
    @Column(name = "location_image")
    private String locationImage;


    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserApp userApp;


    @ManyToOne
    @JoinColumn(name = "place_id")
    private Place place;


}
