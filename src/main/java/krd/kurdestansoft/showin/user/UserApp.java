package krd.kurdestansoft.showin.user;


import krd.kurdestansoft.showin.comment.Comment;
import krd.kurdestansoft.showin.common.BaseEntity;
import krd.kurdestansoft.showin.file_attachment.FileAttachment;
import krd.kurdestansoft.showin.like.Like;
import krd.kurdestansoft.showin.place.Place;
import lombok.Data;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "tbl_user")
@Data
@Audited
public class UserApp extends BaseEntity {

    @NotNull
    @Column(name = "first_name")
    private String firstName;

    @NotNull
    @Column(name = "last_name")
    private String lastName;

    @NotNull
    @Column(name = "email")
    private String email;

    @NotNull
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @NotNull
    @Column(name = "birth_day")
    private Date birthDay;


    @OneToMany(fetch = FetchType.LAZY,mappedBy = "userApp",cascade = CascadeType.ALL)
    private List<Like> likes;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "userApp",cascade = CascadeType.ALL)
    private List<Comment> comments;

    @OneToMany(fetch = FetchType.LAZY,mappedBy ="userApp",cascade = CascadeType.ALL)
    private List<FileAttachment>  fileAttachments;


}
