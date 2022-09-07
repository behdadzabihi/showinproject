package krd.kurdestansoft.showin.file_attachment;

import java.util.List;

public interface IFileAttachmentService {

    FileAttachment save(FileAttachment fileAttachment);
    void delete(Long id);
    FileAttachment getById(Long id);
    List<FileAttachment> getAll();
    List<FileAttachment> getPlaceById(Long plcId);

}
