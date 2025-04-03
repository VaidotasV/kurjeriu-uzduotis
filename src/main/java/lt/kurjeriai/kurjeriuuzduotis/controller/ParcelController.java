package lt.kurjeriai.kurjeriuuzduotis.controller;

import lt.kurjeriai.kurjeriuuzduotis.model.Parcel;
import lt.kurjeriai.kurjeriuuzduotis.repository.CourierRepository;
import lt.kurjeriai.kurjeriuuzduotis.repository.ParcelRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/parcels")
public class ParcelController {

    @Autowired
    private ParcelRepository parcelRepository;

    @Autowired
    private CourierRepository courierRepository;

    @GetMapping
    public List<Parcel> getAllParcels() {
        return parcelRepository.findAll();
    }

    @PostMapping
    public Parcel createParcel(@RequestBody Parcel parcel) {
        return parcelRepository.save(parcel);
    }

    @PutMapping("/{id}/status")
    public Parcel updateParcelStatus(@PathVariable Long id, @RequestParam Parcel.Status status) {
        Parcel parcel = parcelRepository.findById(id).orElseThrow(() -> new RuntimeException("Parcel not found"));
        parcel.setStatus(status);
        return parcelRepository.save(parcel);
    }

}

