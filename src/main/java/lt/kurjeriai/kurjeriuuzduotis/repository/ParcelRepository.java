package lt.kurjeriai.kurjeriuuzduotis.repository;

import lt.kurjeriai.kurjeriuuzduotis.model.Parcel;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ParcelRepository extends JpaRepository<Parcel, Long> {
}
