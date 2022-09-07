package krd.kurdestansoft.showin.user;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-09-07T04:49:40-0700",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 18.0.2 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserApp toUser(UserAppDTO userAppDTO) {
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

    @Override
    public UserAppDTO toUserDTO(UserApp userApp) {
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

    @Override
    public List<UserApp> toUsers(List<UserAppDTO> userAppDTOS) {
        if ( userAppDTOS == null ) {
            return null;
        }

        List<UserApp> list = new ArrayList<UserApp>( userAppDTOS.size() );
        for ( UserAppDTO userAppDTO : userAppDTOS ) {
            list.add( toUser( userAppDTO ) );
        }

        return list;
    }

    @Override
    public List<UserAppDTO> toUserDTOs(List<UserApp> userApps) {
        if ( userApps == null ) {
            return null;
        }

        List<UserAppDTO> list = new ArrayList<UserAppDTO>( userApps.size() );
        for ( UserApp userApp : userApps ) {
            list.add( toUserDTO( userApp ) );
        }

        return list;
    }
}
