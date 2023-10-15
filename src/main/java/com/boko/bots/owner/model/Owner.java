package com.boko.bots.owner.model;

import com.boko.bots.platform.Platform;
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
public class Owner {

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
    private String name;
    private String surname;
    private String email;
    private String phone;
    @ManyToMany
    @JoinTable(
            name = "owner_platform",
            joinColumns = @JoinColumn(name = "owner_id"),
            inverseJoinColumns = @JoinColumn(name = "platform_id"))
    private Set<Platform> platforms;
}
