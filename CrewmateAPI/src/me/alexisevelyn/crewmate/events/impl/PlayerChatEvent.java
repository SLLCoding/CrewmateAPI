package me.alexisevelyn.crewmate.events.impl;

import me.alexisevelyn.crewmate.events.Event;

public abstract class PlayerChatEvent extends Event {

    public PlayerChatEvent(int playerId, String message) {}

    public abstract int getPlayerId();
    public abstract String getMessage();

}
