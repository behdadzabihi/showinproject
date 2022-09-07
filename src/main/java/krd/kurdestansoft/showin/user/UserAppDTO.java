package krd.kurdestansoft.showin.user;

import io.swagger.annotations.ApiModelProperty;
import krd.kurdestansoft.showin.common.BaseDTO;
import lombok.Data;
import java.sql.Date;


@Data
public class UserAppDTO extends BaseDTO {


    @ApiModelProperty(required = true,hidden = false)
    private String firstName;

    @ApiModelProperty(required = true,hidden = false)
    private String lastName;

    @ApiModelProperty(required = true,hidden = false)
    private String email;

    @ApiModelProperty(required = true,hidden = false)
    private Gender gender;

    @ApiModelProperty(required = true,hidden = false)
    private Date birthDay;



}
