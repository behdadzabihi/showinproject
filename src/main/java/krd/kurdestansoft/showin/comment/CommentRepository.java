package krd.kurdestansoft.showin.comment;


import krd.kurdestansoft.showin.place.Place;
import krd.kurdestansoft.showin.user.UserApp;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CommentRepository extends PagingAndSortingRepository<Comment,Long> {

    List<Comment> findByUserApp(UserApp userApp);
    List<Comment> findByPlace(Place place);


}
