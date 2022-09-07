package krd.kurdestansoft.showin.place;

import lombok.AllArgsConstructor;
import org.geolatte.geom.G2D;
import org.geolatte.geom.Geometries;
import org.geolatte.geom.Point;
import org.geolatte.geom.crs.CoordinateReferenceSystems;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.RolesAllowed;
import java.util.List;

@RestController
@RequestMapping(value = "/place/")
@AllArgsConstructor
public class PlaceController {

    private IPlaceService service;

    private PlaceMapper mapper;

    @PostMapping("/v1")
    public ResponseEntity<PlaceDTO> save(@RequestBody PlaceDTO placeDTO){
        Place place=mapper.toPlace(placeDTO);
        service.save(place);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }


    @PutMapping("/v1")
    public ResponseEntity<PlaceDTO> update(@RequestBody PlaceDTO placeDTO){
        Place place=mapper.toPlace(placeDTO);
        service.update(place);
        return ResponseEntity.ok(placeDTO);
    }


    @DeleteMapping("/v1/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        service.delete(id);
        return ResponseEntity.ok().build();
    }


    @GetMapping("/v1")
    public ResponseEntity<List<PlaceDTO>> getAll(){
        List<Place> places=service.getAll();
        List<PlaceDTO> placeDTOS=mapper.toPlaceDTOs(places);
        return ResponseEntity.ok(placeDTOS);
    }

    @GetMapping("/v1/{lat}/{lng}/{distance}")
    public ResponseEntity<List<PlaceDTO>> filterByNearest(@PathVariable(name = "lat") double lat,@PathVariable(name = "lng") double lng,@PathVariable(name = "distance") double distance){
        Point<G2D> point= Geometries.mkPoint(new G2D(lng,lat), CoordinateReferenceSystems.WGS84);
        List<Place> places=service.findNearest(point,distance);
        List<PlaceDTO> placeDTOS=mapper.toPlaceDTOs(places);
        return ResponseEntity.ok(placeDTOS);

    }

}
