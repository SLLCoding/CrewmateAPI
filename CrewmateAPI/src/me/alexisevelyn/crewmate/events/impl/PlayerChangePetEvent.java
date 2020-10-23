package me.alexisevelyn.crewmate.events.impl;

import me.alexisevelyn.crewmate.enums.cosmetic.Pet;
import me.alexisevelyn.crewmate.events.EventCancellable;

public abstract class PlayerChangePetEvent extends EventCancellable {

    public PlayerChangePetEvent(Pet pet) {}

    public abstract Pet getPet();

}
