package me.alexisevelyn.crewmate.enums.hazel;

public enum SendOption {

	NONE((byte) 0x00),
	RELIABLE((byte) 0x01),
	HELLO((byte) 0x08),
	DISCONNECT((byte) 0x09),
	ACKNOWLEDGEMENT((byte) 0x0A),
	FRAGMENT((byte) 0x0B),
	PING((byte) 0x0C);

	SendOption(byte sendOption) {}

	public static SendOption getSendOption(byte sendOptionValue) { return null; }

	public static String getSendOptionName(SendOption sendOptionType) { return null; }

	public byte getSendOption() { return -1; }

}