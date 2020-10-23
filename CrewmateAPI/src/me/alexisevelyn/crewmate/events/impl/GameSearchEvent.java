package me.alexisevelyn.crewmate.events.impl;

import me.alexisevelyn.crewmate.enums.Language;
import me.alexisevelyn.crewmate.enums.Map;
import me.alexisevelyn.crewmate.events.Event;

public abstract class GameSearchEvent extends Event {

    public GameSearchEvent(Language language, Map[] maps, int impostors) {}

    public abstract byte[] getGames();
    public abstract void setGames(byte[] games);
    public abstract Language getLanguage();
    public abstract int getImpostors();
    public abstract Map[] getMaps();

}
