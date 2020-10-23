package me.alexisevelyn.crewmate.enums.cosmetic;

public enum Skin {
	NONE(0),
	ASTRONAUT(1),
	CAPTAIN(2),
	MECHANIC(3),
	MILITARY(4),
	POLICE(5),
	SCIENTIST(6),
	SUIT_BLACK(7),
	SUIT_WHITE(8),
	THE_WALL(9),
	HAZMAT(10),
	SECURITY(11),
	TARMAC(12),
	MINER(13),
	WINTER(14),
	ARCHAEOLOGIST(15);

	Skin(int skin) {}

	public int getSkin() { return -1; }

	public static Skin getSkin(int skinInteger) { return null; }

	public static String getSkinName(Skin skin) { return null; }

}
