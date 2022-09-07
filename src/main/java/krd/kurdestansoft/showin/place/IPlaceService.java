package krd.kurdestansoft.showin.place;

import org.geolatte.geom.G2D;
import org.geolatte.geom.Point;

import java.util.List;

public interface IPlaceService {

    Place save(Place place);

    Place update(Place place);

    List<Place> getAll();

    void delete(Long id);

    Place getById(Long id);

    List<Place> findNearest(Point<G2D> point,double distance);
}
