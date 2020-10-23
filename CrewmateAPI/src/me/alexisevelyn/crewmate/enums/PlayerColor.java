package me.alexisevelyn.crewmate.enums;


public enum PlayerColor {
	RED((byte) 0),
	BLUE((byte) 1),
	DARK_GREEN((byte) 2),
	PINK((byte) 3),
	ORANGE((byte) 4),
	YELLOW((byte) 5),
	DARK_GRAY((byte) 6),
	WHITE((byte) 7),
	PURPLE((byte) 8),
	BROWN((byte) 9),
	CYAN((byte) 10),
	LIGHT_GREEN((byte) 11);

	PlayerColor(int playerColor) {}

	public int getColor() { return -1; }

	public static PlayerColor getColor(int playerColorInteger) { return null; }

	public static String getColorName(PlayerColor playerColor) { return null; }

}
