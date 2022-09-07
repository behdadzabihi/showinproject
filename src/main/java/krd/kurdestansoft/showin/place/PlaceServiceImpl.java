package krd.kurdestansoft.showin.place;

import krd.kurdestansoft.showin.common.exception.NotFoundException;
import krd.kurdestansoft.showin.user.IUserService;
import krd.kurdestansoft.showin.user.UserApp;
import lombok.AllArgsConstructor;
import org.geolatte.geom.G2D;
import org.geolatte.geom.Point;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class PlaceServiceImpl implements IPlaceService {

    private final PlaceRepository repository;


    @Override
    public Place save(Place place) {
        return repository.save(place);
    }

    @Override
    public Place update(Place place) {
        Place lastPlace=getById(place.getId());
        lastPlace.setTitle(place.getTitle());
        lastPlace.setAddress(place.getAddress());
        lastPlace.setStartService(place.getStartService());
        lastPlace.setType(place.getType());
        lastPlace.setLocation(place.getLocation());
        return repository.save(lastPlace);
    }

    @Override
    public List<Place> getAll() {
        return (List<Place>) repository.findAll();
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Place getById(Long id) {
        Optional<Place> optionalPlace=repository.findById(id);
        if(!optionalPlace.isPresent()){
            throw new NotFoundException("NoT FOUND PLACE");
        }
        return optionalPlace.get();
    }

    @Override
    public List<Place> findNearest(Point<G2D> point, double distance) {
        return repository.findAllWithDistance3(point,distance);
    }
}
