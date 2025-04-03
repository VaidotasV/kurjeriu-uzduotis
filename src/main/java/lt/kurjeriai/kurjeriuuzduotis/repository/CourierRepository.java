package lt.kurjeriai.kurjeriuuzduotis.repository;

import lt.kurjeriai.kurjeriuuzduotis.model.Courier;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CourierRepository extends JpaRepository<Courier, Long> {
}

