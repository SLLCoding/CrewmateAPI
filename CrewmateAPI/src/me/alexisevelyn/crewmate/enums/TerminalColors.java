package me.alexisevelyn.crewmate.enums;

public enum TerminalColors {
	ANSI_RESET("\u001B[0m"),
	SET_TITLE_BEGINNING("\033]0;"),
	SET_TITLE_END("\007"),

	ANSI_TEXT_BLACK("\u001B[30m"),
	ANSI_TEXT_RED("\u001B[31m"),
	ANSI_TEXT_GREEN("\u001B[32m"),
	ANSI_TEXT_YELLOW("\u001B[33m"),
	ANSI_TEXT_BLUE("\u001B[34m"),
	ANSI_TEXT_PURPLE("\u001B[35m"),
	ANSI_TEXT_CYAN("\u001B[36m"),
	ANSI_TEXT_WHITE("\u001B[37m"),

	ANSI_BACKGROUND_BLACK("\u001B[40m"),
	ANSI_BACKGROUND_RED("\u001B[41m"),
	ANSI_BACKGROUND_GREEN("\u001B[42m"),
	ANSI_BACKGROUND_YELLOW("\u001B[43m"),
	ANSI_BACKGROUND_BLUE("\u001B[44m"),
	ANSI_BACKGROUND_PURPLE("\u001B[45m"),
	ANSI_BACKGROUND_CYAN("\u001B[46m"),
	ANSI_BACKGROUND_WHITE("\u001B[47m");

	TerminalColors(final String formattingCode) {}

	@Override
	public String toString() { return null; }

	public static String getTitle(String title) { return null; }

	public static String get256ColorForeground(int color) { return null; }

	public static String get256ColorBackground(int color) { return null; }

}
