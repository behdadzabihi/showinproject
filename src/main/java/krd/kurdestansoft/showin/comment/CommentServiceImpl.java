package krd.kurdestansoft.showin.comment;

import krd.kurdestansoft.showin.common.exception.NotFoundException;
import krd.kurdestansoft.showin.place.IPlaceService;
import krd.kurdestansoft.showin.place.Place;
import krd.kurdestansoft.showin.user.IUserService;
import krd.kurdestansoft.showin.user.UserApp;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CommentServiceImpl implements ICommentService {

    private CommentRepository repository;

    private IPlaceService iPlaceService;

    private IUserService userService;

    @Override
    public Comment save(Comment comment) {
        Long userAppId=comment.getUserApp().getId();
        UserApp userApp=userService.getById(userAppId);
        comment.setUserApp(userApp);
        Long plcId=comment.getPlace().getId();
        Place place=iPlaceService.getById(plcId);
        comment.setPlace(place);
        return repository.save(comment);
    }

    @Override
    public Comment update(Comment comment) {
       Comment lastComment=getById(comment.getId());
        lastComment.setDate(comment.getDate());
        lastComment.setMessage(comment.getMessage());
        return lastComment;
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<Comment> getAll() {
        return (List<Comment>) repository.findAll();
    }

    @Override
    public List<Comment> getByUserApp(Long userAppId) {
        UserApp userApp=userService.getById(userAppId);
        return repository.findByUserApp(userApp);
    }


    @Override
    public List<Comment> getByPlace(Long plcId) {
        Place place=iPlaceService.getById(plcId);
        return repository.findByPlace(place);
    }



    @Override
    public Comment getById(Long id) {
        Optional<Comment> commentOptional=repository.findById(id);
        if(!commentOptional.isPresent()){
            throw new NotFoundException("NOT FOUND COMMENT");
        }
        return commentOptional.get();
    }
}
