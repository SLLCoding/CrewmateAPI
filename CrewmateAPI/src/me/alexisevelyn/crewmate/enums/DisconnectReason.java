package me.alexisevelyn.crewmate.enums;

public enum DisconnectReason {

	NONE((byte) 0x00),
	GAME_FULL((byte) 0x01),
	GAME_STARTED((byte) 0x02),
	GAME_NOT_FOUND((byte) 0x03),
	LEGACY_CUSTOM((byte) 0x04),
	OUTDATED_CLIENT((byte) 0x05),
	BANNED_FROM_ROOM((byte) 0x06),
	KICKED_FROM_ROOM((byte) 0x07),
	CUSTOM((byte) 0x08),
	INVALID_USERNAME((byte) 0x09),
	HACKING((byte) 0x0A),
	FORCE_NO_REASON((byte) 0x10),
	BAD_CONNECTION((byte) 0x11),
	GAME_NOT_FOUND_TWO((byte) 0x12),
	ROOM_CLOSED((byte) 0x13),
	SERVER_OVERLOADED((byte) 0x14);

	DisconnectReason(byte reason) {}

	public byte getReason() { return -1; }

	public static DisconnectReason getReason(byte reasonByte) { return null; }

	public static String getReasonName(DisconnectReason map) { return null; }

}
