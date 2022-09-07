package krd.kurdestansoft.showin.like;

import krd.kurdestansoft.showin.place.Place;
import krd.kurdestansoft.showin.place.PlaceMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")

public interface LikeMapper {


    Like toLike(LikeDTO likeDTO);

    LikeDTO toLikeDTO(Like like);

    List<Like> toLikes(List<LikeDTO> likeDTOS);

    List<LikeDTO> toLikeDTOS(List<Like> likes);

}
