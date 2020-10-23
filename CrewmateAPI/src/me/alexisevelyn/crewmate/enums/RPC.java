package me.alexisevelyn.crewmate.enums;

public enum RPC {
	ANIMATION((byte) 0),
	COMPLETE_TASK((byte) 1),
	SYNC_SETTINGS((byte) 2),
	SET_INFECTED((byte) 3),
	EXILED((byte) 4),
	CHECK_NAME((byte) 5),
	SET_NAME((byte) 6),
	CHECK_COLOR((byte) 7),
	SET_COLOR((byte) 8),
	SET_HAT((byte) 9),
	SET_SKIN((byte) 10),
	REPORT_DEAD_BODY((byte) 11),
	MURDER_PLAYER((byte) 12),
	SEND_CHAT((byte) 13),
	START_MEETING((byte) 14),
	SET_SCANNER((byte) 15),
	SEND_CHAT_NOTE((byte) 16),

	SET_PET((byte) 17),
	SET_START_COUNTER((byte) 18),
	ENTER_VENT((byte) 19),
	EXIT_VENT((byte) 20),
	SNAP_TO((byte) 21),
	CLOSE((byte) 22),
	VOTING_COMPLETE((byte) 23),
	CAST_VOTE((byte) 24),
	CLEAR_VOTE((byte) 25),
	ADD_VOTE((byte) 26),
	CLOSE_DOOR((byte) 27),
	REPAIR_SYSTEM((byte) 28),
	SET_TASKS((byte) 29),
	UPDATE_GAME_DATA((byte) 30);

	RPC(int rpc) {}

	public int getRPC() { return -1; }

	public static RPC getRPC(int rpcInteger) { return null; }

	public static String getRPCName(RPC rpc) { return null; }

}
