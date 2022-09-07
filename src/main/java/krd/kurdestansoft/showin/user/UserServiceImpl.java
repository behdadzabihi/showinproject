package krd.kurdestansoft.showin.user;

import krd.kurdestansoft.showin.common.exception.NotFoundException;
import krd.kurdestansoft.showin.like.LikeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserServiceImpl implements IUserService {

    private UserRepository repository;


    @Override
    public UserApp save(UserApp userApp) {
        return repository.save(userApp);
    }

    @Override
    public UserApp update(UserApp userApp) {
        UserApp lastUserApp =getById(userApp.getId());
        lastUserApp.setFirstName(userApp.getFirstName());
        lastUserApp.setLastName(userApp.getLastName());
        lastUserApp.setEmail(userApp.getEmail());
        lastUserApp.setGender(userApp.getGender());
        lastUserApp.setBirthDay(userApp.getBirthDay());
        return lastUserApp;
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<UserApp> getAll() {
        return (List<UserApp>) repository.findAll();
    }


    @Override
    public UserApp getById(Long id) {
        Optional<UserApp> userOptional=repository.findById(id);
        if(!userOptional.isPresent()){
            throw new NotFoundException("NOT FOUND USER");
        }
        return userOptional.get();
    }
}
