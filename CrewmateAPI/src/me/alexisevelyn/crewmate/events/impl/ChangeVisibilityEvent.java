package me.alexisevelyn.crewmate.events.impl;

import me.alexisevelyn.crewmate.Server;
import me.alexisevelyn.crewmate.api.Player;
import me.alexisevelyn.crewmate.events.EventCancellable;

public abstract class ChangeVisibilityEvent extends EventCancellable {

    public ChangeVisibilityEvent(Server server, Player player, boolean visible) {}

    public abstract boolean isVisible();
    public abstract void setVisible(boolean visible);
    public abstract Server getServer();
    public abstract Player getPlayer();

}
