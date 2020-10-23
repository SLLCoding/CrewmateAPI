package me.alexisevelyn.crewmate.events.impl;

import me.alexisevelyn.crewmate.events.EventCancellable;

import java.net.InetAddress;

public abstract class PlayerJoinEvent extends EventCancellable {

    public PlayerJoinEvent(String gameCode, InetAddress address, int port) {}

    public abstract String getFullAddress();
    public abstract InetAddress getAddress();
    public abstract int getPort();
    public abstract byte[] getGameCodeBytes();
    public abstract String getGameCode();

}
