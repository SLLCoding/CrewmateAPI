package me.alexisevelyn.crewmate.events;

public abstract class EventCancellable extends Event {

    public abstract boolean isCancelled();
    public abstract String getReason();

    public abstract void setCancelled(boolean cancelled);
    public abstract void setCancelled(boolean cancelled, String reason);

}
