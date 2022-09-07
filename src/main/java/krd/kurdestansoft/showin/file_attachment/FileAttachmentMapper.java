package krd.kurdestansoft.showin.file_attachment;


import krd.kurdestansoft.showin.place.PlaceMapper;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface FileAttachmentMapper {

    FileAttachment toFileAttachment(FileAttachmentDTO fileAttachmentDTO);
    FileAttachmentDTO toFileAttachmentDTO(FileAttachment fileAttachment);
    List<FileAttachment> toFileAttachmentList(List<FileAttachmentDTO> fileAttachmentDTOs);
    List<FileAttachmentDTO> toFileAttachmentDTOs(List<FileAttachment> fileAttachments);

}
