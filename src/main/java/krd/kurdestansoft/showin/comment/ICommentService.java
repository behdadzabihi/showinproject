package krd.kurdestansoft.showin.comment;


import java.util.List;

public interface ICommentService {

    Comment save(Comment comment);

    Comment update(Comment comment);

    void delete(Long id);

    List<Comment> getAll();

    List<Comment> getByUserApp(Long userAppId);

    List<Comment> getByPlace(Long plcId);

    Comment getById(Long id);
}
