package krd.kurdestansoft.showin.place;

import io.swagger.annotations.ApiModelProperty;
import krd.kurdestansoft.showin.common.BaseDTO;
import krd.kurdestansoft.showin.user.UserAppDTO;
import lombok.Data;

@Data
public class PlaceDTO extends BaseDTO {


   @ApiModelProperty(required = true,hidden = false)
    private String title;

    @ApiModelProperty(required = true,hidden = false)
    private String address;

    @ApiModelProperty(required = true,hidden = false)
    private Integer startService;

    @ApiModelProperty(required = true,hidden = false)
    private Integer endService;

    @ApiModelProperty(required = true,hidden = false)
    private LocationDTO locationDTO;

    @ApiModelProperty(required = true,hidden = false)
    private Type type;


}
