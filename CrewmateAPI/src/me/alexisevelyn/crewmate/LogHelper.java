package me.alexisevelyn.crewmate;

import java.util.Map;

public abstract class LogHelper {

	public static void printLine() {}
	public static void printLine(Object line) {}
	public static void print(Object line) {}
	public static void printFormatted(String line, Object... args) {}
	public static void printLineErr(Object line) {}
	public static void printErr(Object line) {}
	public static void printPacketBytes(byte[] bytes, int length) {}
	public static void printPacketBytesHorizontal(byte[] bytes, int length) {}
	public static void printPacketBytesVertical(byte[] bytes, int length) {}
	public static String convertByteToHexString(byte bite) { return null; }
	public static String formatNamed(String format, Map<String, Object> values) { return null; }

}
