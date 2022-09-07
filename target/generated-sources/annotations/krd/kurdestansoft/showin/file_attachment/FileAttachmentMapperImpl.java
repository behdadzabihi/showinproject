package krd.kurdestansoft.showin.file_attachment;

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
    date = "2022-09-07T04:49:40-0700",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 18.0.2 (Oracle Corporation)"
)
@Component
public class FileAttachmentMapperImpl implements FileAttachmentMapper {

    @Override
    public FileAttachment toFileAttachment(FileAttachmentDTO fileAttachmentDTO) {
        if ( fileAttachmentDTO == null ) {
            return null;
        }

        FileAttachment fileAttachment = new FileAttachment();

        fileAttachment.setId( fileAttachmentDTO.getId() );
        fileAttachment.setVersion( fileAttachmentDTO.getVersion() );
        fileAttachment.setCreatedData( fileAttachmentDTO.getCreatedData() );
        fileAttachment.setCreatedBy( fileAttachmentDTO.getCreatedBy() );
        fileAttachment.setLastModifiedData( fileAttachmentDTO.getLastModifiedData() );
        fileAttachment.setLastModifiedBy( fileAttachmentDTO.getLastModifiedBy() );
        fileAttachment.setLocationImage( fileAttachmentDTO.getLocationImage() );
        fileAttachment.setPlace( placeDTOToPlace( fileAttachmentDTO.getPlace() ) );
        fileAttachment.setUserApp( userAppDTOToUserApp( fileAttachmentDTO.getUserApp() ) );

        return fileAttachment;
    }

    @Override
    public FileAttachmentDTO toFileAttachmentDTO(FileAttachment fileAttachment) {
        if ( fileAttachment == null ) {
            return null;
        }

        FileAttachmentDTO fileAttachmentDTO = new FileAttachmentDTO();

        fileAttachmentDTO.setId( fileAttachment.getId() );
        fileAttachmentDTO.setVersion( fileAttachment.getVersion() );
        fileAttachmentDTO.setCreatedData( fileAttachment.getCreatedData() );
        fileAttachmentDTO.setCreatedBy( fileAttachment.getCreatedBy() );
        fileAttachmentDTO.setLastModifiedData( fileAttachment.getLastModifiedData() );
        fileAttachmentDTO.setLastModifiedBy( fileAttachment.getLastModifiedBy() );
        fileAttachmentDTO.setLocationImage( fileAttachment.getLocationImage() );
        fileAttachmentDTO.setPlace( placeToPlaceDTO( fileAttachment.getPlace() ) );
        fileAttachmentDTO.setUserApp( userAppToUserAppDTO( fileAttachment.getUserApp() ) );

        return fileAttachmentDTO;
    }

    @Override
    public List<FileAttachment> toFileAttachmentList(List<FileAttachmentDTO> fileAttachmentDTOs) {
        if ( fileAttachmentDTOs == null ) {
            return null;
        }

        List<FileAttachment> list = new ArrayList<FileAttachment>( fileAttachmentDTOs.size() );
        for ( FileAttachmentDTO fileAttachmentDTO : fileAttachmentDTOs ) {
            list.add( toFileAttachment( fileAttachmentDTO ) );
        }

        return list;
    }

    @Override
    public List<FileAttachmentDTO> toFileAttachmentDTOs(List<FileAttachment> fileAttachments) {
        if ( fileAttachments == null ) {
            return null;
        }

        List<FileAttachmentDTO> list = new ArrayList<FileAttachmentDTO>( fileAttachments.size() );
        for ( FileAttachment fileAttachment : fileAttachments ) {
            list.add( toFileAttachmentDTO( fileAttachment ) );
        }

        return list;
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
}
