package com.boko.bots.botuser;

import com.boko.bots.basebot.Bot;
import jakarta.persistence.ManyToOne;

public class BotUser {

    @ManyToOne
    public Bot bot;
}
