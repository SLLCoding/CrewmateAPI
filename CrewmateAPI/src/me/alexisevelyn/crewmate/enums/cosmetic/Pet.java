package me.alexisevelyn.crewmate.enums.cosmetic;

public enum Pet {
	NONE(0),
	ALIEN(1),
	CREWMATE(2),
	DOG(3),
	STICKMIN(4),
	HAMSTER(5),
	ROBOT(6),
	UFO(7),
	ELLIE(8),
	SQUIG(9),
	BEDCRAB(10);

	Pet(int pet) {}

	public int getPet() { return -1; }

	public static Pet getPet(int hatInteger) { return null; }

	public static String getPetName(Pet pet) { return null; }

}