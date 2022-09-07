package krd.kurdestansoft.showin.like;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(value = "/like-place-by-user/")
@AllArgsConstructor
public class LikeController {

    private final ILikeService service;

    private final LikeMapper mapper;

    @PostMapping("v1")
    public ResponseEntity<LikeDTO> save(@RequestBody LikeDTO likeDTO){
        Like like=mapper.toLike(likeDTO);
        service.save(like);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("vi")
    public ResponseEntity<List<LikeDTO>> getAll(){
        List<Like> likes=service.getAll();
        List<LikeDTO> likeDTOS=mapper.toLikeDTOS(likes);
        return ResponseEntity.ok(likeDTOS);
    }

    @GetMapping("vi/filter-by-place/{plcId}")
    public ResponseEntity<List<LikeDTO>> findByPlace(@PathVariable Long plcId){
        List<Like> likes=service.getByPlace(plcId);
        List<LikeDTO> likeDTOS=mapper.toLikeDTOS(likes);
        return ResponseEntity.ok(likeDTOS);
    }

    @GetMapping("/v1/filter-by-user/{userAppId}")
    public ResponseEntity<List<LikeDTO>> getByUsers(@PathVariable Long userAppId){
        List<Like> likes=service.getByUserApp(userAppId);
        List<LikeDTO> likeDTOS=mapper.toLikeDTOS(likes);
        return ResponseEntity.ok(likeDTOS);
    }

    @DeleteMapping("v1/{id}")
    public ResponseEntity delete(@PathVariable Long id){
        service.delete(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping
    public ResponseEntity<LikeDTO> update(@RequestBody LikeDTO likeDTO){
        Like like=mapper.toLike(likeDTO);
        service.update(like);
        return ResponseEntity.ok(likeDTO);
    }

    @GetMapping("v1/{id}")
    public ResponseEntity<LikeDTO> findById(@PathVariable Long id){
       Like like= service.getById(id);
       LikeDTO likeDTO=mapper.toLikeDTO(like);
       return ResponseEntity.ok(likeDTO);
    }
}
