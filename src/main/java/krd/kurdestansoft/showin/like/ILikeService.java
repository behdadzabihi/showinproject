package krd.kurdestansoft.showin.like;

import krd.kurdestansoft.showin.place.Place;

import java.util.List;

public interface ILikeService {

    Like save(Like like);

    Like update(Like like);

    void delete(Long id);

    List<Like> getAll();

    List<Like> getByPlace(Long plcId);

    List<Like> getByUserApp(Long userAppId);

    Like getById(Long id);
}
