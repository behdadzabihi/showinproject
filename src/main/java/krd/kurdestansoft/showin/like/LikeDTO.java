package krd.kurdestansoft.showin.like;

import io.swagger.annotations.ApiModelProperty;
import krd.kurdestansoft.showin.common.BaseDTO;
import krd.kurdestansoft.showin.place.PlaceDTO;
import krd.kurdestansoft.showin.user.UserAppDTO;
import lombok.Data;

@Data
public class LikeDTO extends BaseDTO {

    @ApiModelProperty(required = true,hidden = false)
    private Boolean isFavorite;

    @ApiModelProperty(required = true,hidden = false)
    private UserAppDTO userApp;

    @ApiModelProperty(required = true,hidden = false)
    private PlaceDTO place;

}
