package me.alexisevelyn.crewmate.enums;

public enum ReliablePacketType {
	PRE_HOST_SETTINGS(0x00),
	JOIN_GAME(0x01),
	START_GAME(0x02),
	REMOVE_GAME(0x03),
	REMOVE_PLAYER(0x04),

	GAME_DATA(0x05),
	GAME_DATA_TO(0x06),

	JOINED_GAME(0x07),
	ALTER_GAME(0x0a),
	REDIRECT_GAME(0x0d),

	SEARCH_PUBLIC_GAME(0x10);

	ReliablePacketType(int reliablePacketType) {}

	public int getReliablePacketType() { return -1; }

	public static ReliablePacketType getReliablePacketType(int reliablePacketTypeInteger) { return null; }

	public static String getReliablePacketTypeName(ReliablePacketType reliablePacketType) { return null; }

}
