package me.alexisevelyn.crewmate.enums;

public enum Map {
	SKELD(0),
	MIRA_HQ(1),
	POLUS(2);

	Map(int map) {}

	public int getMap() { return -1; }

	public static Map getMap(int mapInteger) { return null; }

	public static String getMapName(Map map) { return null; }

}