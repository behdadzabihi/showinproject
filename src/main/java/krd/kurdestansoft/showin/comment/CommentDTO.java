package krd.kurdestansoft.showin.comment;

import io.swagger.annotations.ApiModelProperty;
import krd.kurdestansoft.showin.common.BaseDTO;
import krd.kurdestansoft.showin.place.PlaceDTO;
import krd.kurdestansoft.showin.user.UserAppDTO;
import lombok.Data;

import java.util.Date;


@Data
public class CommentDTO extends BaseDTO {

    @ApiModelProperty(required = true,hidden = false)
    private Date date;

    @ApiModelProperty(required = true,hidden = false)
    private String message;

    @ApiModelProperty(required = true,hidden = false)
    private UserAppDTO userApp;

    @ApiModelProperty(required = true,hidden = false)
    private PlaceDTO place;


}
