package me.alexisevelyn.crewmate.events.impl;

import me.alexisevelyn.crewmate.enums.PlayerColor;
import me.alexisevelyn.crewmate.events.EventCancellable;

public abstract class PlayerChangeColorEvent extends EventCancellable {

    public PlayerChangeColorEvent(PlayerColor color) {}

    public abstract PlayerColor getColor();
    public abstract void setColor(PlayerColor color);

}
