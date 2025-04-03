package lt.kurjeriai.kurjeriuuzduotis.controller;

import lt.kurjeriai.kurjeriuuzduotis.model.Courier;
import lt.kurjeriai.kurjeriuuzduotis.repository.CourierRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/couriers")
public class CourierController {

    @Autowired
    private CourierRepository courierRepository;

    @GetMapping
    public List<Courier> getAllCouriers() {
        return courierRepository.findAll();
    }

    @PostMapping
    public Courier createCourier(@RequestBody Courier courier) {
        return courierRepository.save(courier);
    }
}

