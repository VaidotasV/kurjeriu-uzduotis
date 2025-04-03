package lt.kurjeriai.kurjeriuuzduotis.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Parcel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String trackingNumber;
    private double weightKg;
    private String destinationAddress;

    @Enumerated(EnumType.STRING)
    private Status status;

    @ManyToOne
    @JoinColumn(name = "courier_id")
    private Courier courier;

    public enum Status {
        PENDING,
        IN_TRANSIT,
        DELIVERED
    }
}

