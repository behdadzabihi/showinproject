package krd.kurdestansoft.showin.file_attachment;

import krd.kurdestansoft.showin.common.exception.NotFoundException;
import krd.kurdestansoft.showin.place.IPlaceService;
import krd.kurdestansoft.showin.place.Place;
import krd.kurdestansoft.showin.user.UserApp;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class FileAttachmentServiceImpl implements IFileAttachmentService {

    private  final FileAttachmentRepository repository;
    private  final IPlaceService placeService;





    @Override
    public FileAttachment save(FileAttachment fileAttachment) {
        Long plcId=  fileAttachment.getPlace().getId();
        Place place=  placeService.getById(plcId);
        fileAttachment.setPlace(place);
        return repository.save(fileAttachment);
    }


    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public FileAttachment getById(Long id) {
        Optional<FileAttachment> optionalFileAttachment=repository.findById(id);

        if (!optionalFileAttachment.isPresent()){

            throw new NotFoundException("Not Found FILE");
        }


        return optionalFileAttachment.get();
    }

    @Override
    public List<FileAttachment> getAll() {
        return (List<FileAttachment>) repository.findAll();
    }

    @Override
    public List<FileAttachment> getPlaceById(Long plcId) {
        Place place=  placeService.getById(plcId);
        return repository.findByPlace(place);
    }



}
