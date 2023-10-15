package com.boko.bots.platform;

import com.boko.bots.owner.model.Owner;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "owner")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Platform {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "seq_owner"
    )
    @SequenceGenerator(
            name = "seq_owner",
            allocationSize = 5
    )
    private Long id;
    @ManyToMany(mappedBy = "platforms")
    private Set<Owner> owners;
}
