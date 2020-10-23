package me.alexisevelyn.crewmate.events.impl;

import me.alexisevelyn.crewmate.enums.cosmetic.Skin;
import me.alexisevelyn.crewmate.events.EventCancellable;

public abstract class PlayerChangeSkinEvent extends EventCancellable {

    public PlayerChangeSkinEvent(Skin skin) {}

    public abstract Skin getSkin();

}
