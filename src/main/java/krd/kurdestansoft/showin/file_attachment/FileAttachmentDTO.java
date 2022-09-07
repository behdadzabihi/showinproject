package krd.kurdestansoft.showin.file_attachment;

import io.swagger.annotations.ApiModelProperty;
import krd.kurdestansoft.showin.common.BaseDTO;
import krd.kurdestansoft.showin.place.PlaceDTO;
import lombok.Data;

@Data
public class FileAttachmentDTO extends BaseDTO {

    @ApiModelProperty(required = true,hidden = false)
    private String locationImage;

    @ApiModelProperty(required = true,hidden = false)
    private PlaceDTO place;


}
