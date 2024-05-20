package sec07;

class Chess {
	enum ChessPlayer {
		WHITE, BLACK
	}

	final ChessPlayer getFirstPlayer() {
		return ChessPlayer.WHITE;
	}
}

class WorldChess extends Chess {
//	ChessPlayer getFirstPlayer() {}
}

public class FinalMethodDemo {
}
