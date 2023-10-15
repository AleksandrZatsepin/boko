package com.boko.bots.basebot;

import com.boko.bots.botuser.BotUser;
import com.boko.bots.owner.model.Owner;
import com.boko.bots.platform.Platform;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

import java.util.Set;

public class Bot {

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
    private Owner owner;
    private Platform platform;
    private Set<BotUser> botUsers;
}
