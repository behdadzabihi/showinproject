package krd.kurdestansoft.showin.place;

import org.geolatte.geom.G2D;
import org.geolatte.geom.Point;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface PlaceRepository extends PagingAndSortingRepository<Place,Long> {

    @Query("SELECT vl from Place vl where  distance(vl.location, ?1) < ?2")
    List<Place> findAllWithDistance3(Point<G2D> refPnt, double dist);

}
