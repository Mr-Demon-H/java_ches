package CoVua.boardgame;

public class BoardException extends RuntimeException {
    
    private static final long serialVersionUID = 1L;
	// Thông báo của bàn cờ
	public BoardException(String msg) {
		super(msg);
	}
}
