package me.alexisevelyn.crewmate.api;

import me.alexisevelyn.crewmate.Server;
import me.alexisevelyn.crewmate.enums.DisconnectReason;

import java.net.InetAddress;

public abstract class Player {

    public Player(String name, InetAddress address, int port, int hazelVersion, int clientVersionRaw, Server server) {}

    public abstract int getPort();
    public abstract InetAddress getAddress();
    public abstract int getId();
    public abstract String getName();
    public abstract Server getServer();
    public abstract int getClientVersionRaw();
    public abstract int getHazelVersion();
    public abstract Version getClientVersion();

    public abstract void kick(DisconnectReason reason);
    public abstract void kick(String reason);

    public abstract static class Version {

        public Version(int raw) {}

        public abstract long getDay();
        public abstract long getMonth();
        public abstract long getRevision();
        public abstract long getYear();
        public abstract String getDateFull();
        public abstract String getRevisionFull();
        public abstract String getRevisionLetter();
        public abstract String getVersionFull();

    }

}
