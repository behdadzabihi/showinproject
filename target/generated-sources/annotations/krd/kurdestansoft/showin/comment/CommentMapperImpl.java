package krd.kurdestansoft.showin.comment;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import krd.kurdestansoft.showin.place.Place;
import krd.kurdestansoft.showin.place.PlaceDTO;
import krd.kurdestansoft.showin.user.UserApp;
import krd.kurdestansoft.showin.user.UserAppDTO;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-09-07T08:58:20-0700",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 18.0.2 (Oracle Corporation)"
)
@Component
public class CommentMapperImpl implements CommentMapper {

    @Override
    public Comment toComment(CommentDTO commentDTO) {
        if ( commentDTO == null ) {
            return null;
        }

        Comment comment = new Comment();

        comment.setId( commentDTO.getId() );
        comment.setVersion( commentDTO.getVersion() );
        comment.setCreatedData( commentDTO.getCreatedData() );
        comment.setCreatedBy( commentDTO.getCreatedBy() );
        comment.setLastModifiedData( commentDTO.getLastModifiedData() );
        comment.setLastModifiedBy( commentDTO.getLastModifiedBy() );
        comment.setDate( commentDTO.getDate() );
        comment.setMessage( commentDTO.getMessage() );
        comment.setUserApp( userAppDTOToUserApp( commentDTO.getUserApp() ) );
        comment.setPlace( placeDTOToPlace( commentDTO.getPlace() ) );

        return comment;
    }

    @Override
    public CommentDTO toCommentDTO(Comment comment) {
        if ( comment == null ) {
            return null;
        }

        CommentDTO commentDTO = new CommentDTO();

        commentDTO.setId( comment.getId() );
        commentDTO.setVersion( comment.getVersion() );
        commentDTO.setCreatedData( comment.getCreatedData() );
        commentDTO.setCreatedBy( comment.getCreatedBy() );
        commentDTO.setLastModifiedData( comment.getLastModifiedData() );
        commentDTO.setLastModifiedBy( comment.getLastModifiedBy() );
        commentDTO.setDate( comment.getDate() );
        commentDTO.setMessage( comment.getMessage() );
        commentDTO.setUserApp( userAppToUserAppDTO( comment.getUserApp() ) );
        commentDTO.setPlace( placeToPlaceDTO( comment.getPlace() ) );

        return commentDTO;
    }

    @Override
    public List<Comment> toComments(List<CommentDTO> commentDTOS) {
        if ( commentDTOS == null ) {
            return null;
        }

        List<Comment> list = new ArrayList<Comment>( commentDTOS.size() );
        for ( CommentDTO commentDTO : commentDTOS ) {
            list.add( toComment( commentDTO ) );
        }

        return list;
    }

    @Override
    public List<CommentDTO> toCommentDTOS(List<Comment> comments) {
        if ( comments == null ) {
            return null;
        }

        List<CommentDTO> list = new ArrayList<CommentDTO>( comments.size() );
        for ( Comment comment : comments ) {
            list.add( toCommentDTO( comment ) );
        }

        return list;
    }

    protected UserApp userAppDTOToUserApp(UserAppDTO userAppDTO) {
        if ( userAppDTO == null ) {
            return null;
        }

        UserApp userApp = new UserApp();

        userApp.setId( userAppDTO.getId() );
        userApp.setVersion( userAppDTO.getVersion() );
        userApp.setCreatedData( userAppDTO.getCreatedData() );
        userApp.setCreatedBy( userAppDTO.getCreatedBy() );
        userApp.setLastModifiedData( userAppDTO.getLastModifiedData() );
        userApp.setLastModifiedBy( userAppDTO.getLastModifiedBy() );
        userApp.setFirstName( userAppDTO.getFirstName() );
        userApp.setLastName( userAppDTO.getLastName() );
        userApp.setEmail( userAppDTO.getEmail() );
        userApp.setGender( userAppDTO.getGender() );
        userApp.setBirthDay( userAppDTO.getBirthDay() );

        return userApp;
    }

    protected Place placeDTOToPlace(PlaceDTO placeDTO) {
        if ( placeDTO == null ) {
            return null;
        }

        Place place = new Place();

        place.setId( placeDTO.getId() );
        place.setVersion( placeDTO.getVersion() );
        place.setCreatedData( placeDTO.getCreatedData() );
        place.setCreatedBy( placeDTO.getCreatedBy() );
        place.setLastModifiedData( placeDTO.getLastModifiedData() );
        place.setLastModifiedBy( placeDTO.getLastModifiedBy() );
        place.setTitle( placeDTO.getTitle() );
        place.setAddress( placeDTO.getAddress() );
        place.setStartService( placeDTO.getStartService() );
        place.setEndService( placeDTO.getEndService() );
        place.setType( placeDTO.getType() );

        return place;
    }

    protected UserAppDTO userAppToUserAppDTO(UserApp userApp) {
        if ( userApp == null ) {
            return null;
        }

        UserAppDTO userAppDTO = new UserAppDTO();

        userAppDTO.setId( userApp.getId() );
        userAppDTO.setVersion( userApp.getVersion() );
        userAppDTO.setCreatedData( userApp.getCreatedData() );
        userAppDTO.setCreatedBy( userApp.getCreatedBy() );
        userAppDTO.setLastModifiedData( userApp.getLastModifiedData() );
        userAppDTO.setLastModifiedBy( userApp.getLastModifiedBy() );
        userAppDTO.setFirstName( userApp.getFirstName() );
        userAppDTO.setLastName( userApp.getLastName() );
        userAppDTO.setEmail( userApp.getEmail() );
        userAppDTO.setGender( userApp.getGender() );
        userAppDTO.setBirthDay( userApp.getBirthDay() );

        return userAppDTO;
    }

    protected PlaceDTO placeToPlaceDTO(Place place) {
        if ( place == null ) {
            return null;
        }

        PlaceDTO placeDTO = new PlaceDTO();

        placeDTO.setId( place.getId() );
        placeDTO.setVersion( place.getVersion() );
        placeDTO.setCreatedData( place.getCreatedData() );
        placeDTO.setCreatedBy( place.getCreatedBy() );
        placeDTO.setLastModifiedData( place.getLastModifiedData() );
        placeDTO.setLastModifiedBy( place.getLastModifiedBy() );
        placeDTO.setTitle( place.getTitle() );
        placeDTO.setAddress( place.getAddress() );
        placeDTO.setStartService( place.getStartService() );
        placeDTO.setEndService( place.getEndService() );
        placeDTO.setType( place.getType() );

        return placeDTO;
    }
}
