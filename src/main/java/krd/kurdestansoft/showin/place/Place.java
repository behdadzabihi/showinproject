package krd.kurdestansoft.showin.place;

import krd.kurdestansoft.showin.comment.Comment;
import krd.kurdestansoft.showin.common.BaseEntity;
import krd.kurdestansoft.showin.file_attachment.FileAttachment;
import krd.kurdestansoft.showin.like.Like;
import krd.kurdestansoft.showin.user.UserApp;
import lombok.Data;
import org.geolatte.geom.G2D;
import org.geolatte.geom.Point;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "tbl_place",uniqueConstraints ={@UniqueConstraint(columnNames = {"address","place_location"})})
@Data
@Audited
public class Place extends BaseEntity {

    @NotNull
    @Column(name = "title")
    private String title;

    @NotNull
    @Column(name = "address")
    private String address;

    @NotNull
    @Column(name = "start_service")
    private Integer startService;

    @NotNull
    @Column(name = "end_service")
    private Integer endService;

    @Column(name = "place_location")
    private Point<G2D> location;

    @NotNull
    @Column(name = "type")
    @Enumerated(EnumType.STRING)
    private Type type;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "place",cascade = CascadeType.ALL)
    private List<Like> likes;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "place",cascade = CascadeType.ALL)
    private List<Comment> comments;

    @OneToMany(fetch = FetchType.LAZY,mappedBy ="place",cascade = CascadeType.ALL)
    private List<FileAttachment> fileAttachment;



}
