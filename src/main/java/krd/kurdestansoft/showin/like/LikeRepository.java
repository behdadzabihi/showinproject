package krd.kurdestansoft.showin.like;

import krd.kurdestansoft.showin.place.Place;
import krd.kurdestansoft.showin.user.UserApp;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface LikeRepository extends PagingAndSortingRepository<Like,Long> {

    List<Like> findByUserApp(UserApp userApp);
    List<Like> findByPlace(Place place);


}
