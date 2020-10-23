package me.alexisevelyn.crewmate.events.impl;

import me.alexisevelyn.crewmate.events.EventCancellable;

import java.net.InetAddress;

public abstract class PlayerPreJoinEvent extends EventCancellable {

    public PlayerPreJoinEvent(InetAddress address, int port) {}

    public abstract int getPort();
    public abstract InetAddress getAddress();
    public abstract String getFullAddress();

}
