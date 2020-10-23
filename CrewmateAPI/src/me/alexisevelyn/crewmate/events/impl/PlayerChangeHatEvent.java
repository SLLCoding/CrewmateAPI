package me.alexisevelyn.crewmate.events.impl;

import me.alexisevelyn.crewmate.enums.cosmetic.Hat;
import me.alexisevelyn.crewmate.events.EventCancellable;

public abstract class PlayerChangeHatEvent extends EventCancellable {

    public PlayerChangeHatEvent(Hat hat) {}

    public abstract Hat getHat();
    public abstract void setHat(Hat hat);

}
