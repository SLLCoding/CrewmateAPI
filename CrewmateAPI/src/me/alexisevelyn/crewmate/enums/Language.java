package me.alexisevelyn.crewmate.enums;

public enum Language {
	ENGLISH(convertToInt(0x00, 0x01)),
	OTHER(convertToInt(0x01, 0x00)),
	SPANISH(convertToInt(0x02, 0x00)),
	KOREAN(convertToInt(0x04, 0x00)),
	RUSSIAN(convertToInt(0x08, 0x00)),
	PORTUGUESE(convertToInt(0x10, 0x00)),
	ARABIC(convertToInt(0x20, 0x00)),
	FILIPINO(convertToInt(0x40, 0x00)),
	POLISH(convertToInt(0x80, 0x00));

	public static int convertToInt(int first, int second) { return -1; }

	Language(int language) {}

	public int getLanguage() { return -1; }

	public static Language getLanguage(int languageInteger) { return null; }

	public static String getLanguageName(Language language) { return null; }

}