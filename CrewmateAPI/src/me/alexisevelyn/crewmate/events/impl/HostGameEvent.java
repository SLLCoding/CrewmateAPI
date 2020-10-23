package me.alexisevelyn.crewmate.events.impl;

import me.alexisevelyn.crewmate.enums.Language;
import me.alexisevelyn.crewmate.enums.Map;
import me.alexisevelyn.crewmate.events.Event;

public abstract class HostGameEvent extends Event {

    public HostGameEvent(String gameCode, int maxPlayers, int impostorCount, Map map, Language language) {}

    public abstract void setGameCode(String gameCode) throws IllegalArgumentException;
    public abstract String getGameCode();
    public abstract Map getMap();
    public abstract int getImpostorCount();
    public abstract int getMaxPlayers();
    public abstract Language getLanguage();

}
