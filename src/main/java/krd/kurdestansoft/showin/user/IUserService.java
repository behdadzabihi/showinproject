package krd.kurdestansoft.showin.user;

import java.util.List;

public interface IUserService {

    UserApp save(UserApp userApp);

    UserApp update(UserApp userApp);

    void delete(Long id);

    List<UserApp> getAll();

    UserApp getById(Long id);
}
