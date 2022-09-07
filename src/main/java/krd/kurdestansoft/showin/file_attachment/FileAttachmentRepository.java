package krd.kurdestansoft.showin.file_attachment;

import krd.kurdestansoft.showin.place.Place;
import krd.kurdestansoft.showin.user.UserApp;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface FileAttachmentRepository extends PagingAndSortingRepository<FileAttachment,Long> {

    List<FileAttachment> findByPlace(Place place);

    List<FileAttachment> findByUserApp(UserApp userApp);

}
