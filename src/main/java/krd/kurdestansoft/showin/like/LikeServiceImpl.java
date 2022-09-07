package krd.kurdestansoft.showin.like;

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
public class LikeServiceImpl implements ILikeService{

    private final LikeRepository repository;

    private final IPlaceService iPlaceService;

    private final IUserService userService;


    @Override
    public Like save(Like like) {
        Long userId=like.getUserApp().getId();
        Long plcId=like.getPlace().getId();
        UserApp userApp=userService.getById(userId);
        Place place=iPlaceService.getById(plcId);
        like.setUserApp(userApp);
        like.setPlace(place);
        return repository.save(like);
    }

    @Override
    public Like update(Like like) {
        Like lastLike=getById(like.getId());
        lastLike.setIsFavorite(like.getIsFavorite());
        return lastLike;
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<Like> getAll() {
        return (List<Like>) repository.findAll();
    }

    @Override
    public List<Like> getByPlace(Long plcId) {
        Place place=iPlaceService.getById(plcId);
        return repository.findByPlace(place);
    }

    @Override
    public List<Like> getByUserApp(Long userAppId) {
        UserApp userApp=userService.getById(userAppId);
        return repository.findByUserApp(userApp);
    }


    @Override
    public Like getById(Long id) {
        Optional<Like> likeOptional=repository.findById(id);
        if(!likeOptional.isPresent()){
            throw new NotFoundException("NOT FOUND LIKE");
        }
        return likeOptional.get();
    }
}
