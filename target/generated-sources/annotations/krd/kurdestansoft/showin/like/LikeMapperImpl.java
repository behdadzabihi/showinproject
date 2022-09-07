package krd.kurdestansoft.showin.like;

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
public class LikeMapperImpl implements LikeMapper {

    @Override
    public Like toLike(LikeDTO likeDTO) {
        if ( likeDTO == null ) {
            return null;
        }

        Like like = new Like();

        like.setId( likeDTO.getId() );
        like.setVersion( likeDTO.getVersion() );
        like.setCreatedData( likeDTO.getCreatedData() );
        like.setCreatedBy( likeDTO.getCreatedBy() );
        like.setLastModifiedData( likeDTO.getLastModifiedData() );
        like.setLastModifiedBy( likeDTO.getLastModifiedBy() );
        like.setIsFavorite( likeDTO.getIsFavorite() );
        like.setUserApp( userAppDTOToUserApp( likeDTO.getUserApp() ) );
        like.setPlace( placeDTOToPlace( likeDTO.getPlace() ) );

        return like;
    }

    @Override
    public LikeDTO toLikeDTO(Like like) {
        if ( like == null ) {
            return null;
        }

        LikeDTO likeDTO = new LikeDTO();

        likeDTO.setId( like.getId() );
        likeDTO.setVersion( like.getVersion() );
        likeDTO.setCreatedData( like.getCreatedData() );
        likeDTO.setCreatedBy( like.getCreatedBy() );
        likeDTO.setLastModifiedData( like.getLastModifiedData() );
        likeDTO.setLastModifiedBy( like.getLastModifiedBy() );
        likeDTO.setIsFavorite( like.getIsFavorite() );
        likeDTO.setUserApp( userAppToUserAppDTO( like.getUserApp() ) );
        likeDTO.setPlace( placeToPlaceDTO( like.getPlace() ) );

        return likeDTO;
    }

    @Override
    public List<Like> toLikes(List<LikeDTO> likeDTOS) {
        if ( likeDTOS == null ) {
            return null;
        }

        List<Like> list = new ArrayList<Like>( likeDTOS.size() );
        for ( LikeDTO likeDTO : likeDTOS ) {
            list.add( toLike( likeDTO ) );
        }

        return list;
    }

    @Override
    public List<LikeDTO> toLikeDTOS(List<Like> likes) {
        if ( likes == null ) {
            return null;
        }

        List<LikeDTO> list = new ArrayList<LikeDTO>( likes.size() );
        for ( Like like : likes ) {
            list.add( toLikeDTO( like ) );
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
