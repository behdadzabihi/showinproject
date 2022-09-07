package krd.kurdestansoft.showin.user;

import krd.kurdestansoft.showin.like.Like;
import krd.kurdestansoft.showin.like.LikeDTO;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.RolesAllowed;
import java.util.List;

@RestController
@RequestMapping(value = "/user/")
@AllArgsConstructor
public class UserController {

    private IUserService service;

    private UserMapper mapper;

    @PostMapping("/v1")
    public ResponseEntity<UserAppDTO> save(@RequestBody UserAppDTO UserAppDTO){
        UserApp userApp=mapper.toUser(UserAppDTO);
        service.save(userApp);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/vi")
    public ResponseEntity<List<UserAppDTO>> getAll(){
        List<UserApp> userApps=service.getAll();
        List<UserAppDTO> userAppDTOS =mapper.toUserDTOs(userApps);
        return ResponseEntity.ok(userAppDTOS);
    }


    @DeleteMapping("/v1/{id}")
    public ResponseEntity delete(@PathVariable Long id){
        service.delete(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/v1")
    public ResponseEntity<UserAppDTO> update(@RequestBody UserAppDTO userAppDTO){
        UserApp userApp=mapper.toUser(userAppDTO);
        service.update(userApp);
        return ResponseEntity.ok(userAppDTO);
    }

    @GetMapping("/v1/{id}")
    public ResponseEntity<UserAppDTO> findById(@PathVariable Long id){
        UserApp userApp= service.getById(id);
        UserAppDTO userAppDTO=mapper.toUserDTO(userApp);
        return ResponseEntity.ok(userAppDTO);
    }

}
