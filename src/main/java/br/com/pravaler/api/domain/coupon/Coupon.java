package br.com.pravaler.api.domain.coupon;

import br.com.pravaler.api.domain.event.Event;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name="coupon")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Coupon {

    @Id
    @GeneratedValue
    private UUID id;

    private String code;
    private Integer discount;
    private Date valid;

    /*Um evento pode ter varios cupons, e um cupom pertence a um evento*/

    @ManyToOne
    /*Juntar na tabela evento com a fk event_id*/
    @JoinColumn(name = "event_id")
    private Event event;
}
