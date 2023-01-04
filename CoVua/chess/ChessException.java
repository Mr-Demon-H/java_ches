package CoVua.chess;

import CoVua.boardgame.BoardException;

public class ChessException extends BoardException {
    
    private static final long serialVersionUID = 1L;

	//Thông báo của quân cờ
	public ChessException(String msg) {
		super(msg);
	}
}
