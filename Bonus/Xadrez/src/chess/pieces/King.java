package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece {

	private ChessMatch chessMatch;

	public King(Board board, Color color, ChessMatch chessMatch) {
		super(board, color);
		this.chessMatch = chessMatch;
	}

	@Override
	public String toString() {
		return "K";
	}

	private boolean canMove(Position p) {
		return getBoard().positionExists(p) && (getBoard().piece(p) == null || isThereOpponentPiece(p));
	}

	private boolean testRookCastling(Position position) {
		ChessPiece p = (ChessPiece) getBoard().piece(position);
		return p != null && p instanceof Rook && p.getColor() == getColor() && p.getMoveCount() == 0;
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
		// up
		Position p = new Position(position.getRow() - 1, position.getColumn());
		if (canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}

		// down
		p = new Position(position.getRow() + 1, position.getColumn());
		if (canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}

		// left
		p = new Position(position.getRow(), position.getColumn() - 1);
		if (canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}

		// right
		p = new Position(position.getRow(), position.getColumn() + 1);
		if (canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}

		// diagonal up-left
		p = new Position(position.getRow() - 1, position.getColumn() - 1);
		if (canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}

		// diagonal up-right
		p = new Position(position.getRow() - 1, position.getColumn() + 1);
		if (canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}

		// diagonal down-left
		p = new Position(position.getRow() + 1, position.getColumn() - 1);
		if (canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}

		// diagonal down-right
		p = new Position(position.getRow() + 1, position.getColumn() + 1);
		if (canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}

		// Castling
		if (getMoveCount() == 0 && !chessMatch.getCheck()) {
			Position shortRook = new Position(position.getRow(), position.getColumn() + 3);
			Position longRook = new Position(position.getRow(), position.getColumn() - 4);
			// Short Castling / Kingside Castling
			if (testRookCastling(shortRook)) {
				Position right1 = new Position(position.getRow(), position.getColumn() + 1);
				Position right2 = new Position(position.getRow(), position.getColumn() + 2);
				if (getBoard().piece(right1) == null && getBoard().piece(right2) == null) {
					mat[position.getRow()][position.getColumn() + 2] = true;
				}
			}
			// Long Castling / Queenside Castling
			if (testRookCastling(longRook)) {
				Position left1 = new Position(position.getRow(), position.getColumn() - 1);
				Position left2 = new Position(position.getRow(), position.getColumn() - 2);
				Position left3 = new Position(position.getRow(), position.getColumn() - 3);
				if (getBoard().piece(left1) == null && getBoard().piece(left2) == null
						&& getBoard().piece(left3) == null) {
					mat[position.getRow()][position.getColumn() - 2] = true;
				}
			}
		}
		return mat;
	}

}
