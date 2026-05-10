package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Knight extends ChessPiece {

	public Knight(Board board, Color color) {
		super(board, color);
	}

	@Override
	public String toString() {
		return "N";
	}

	private boolean canMove(Position p) {
		return getBoard().positionExists(p) && (getBoard().piece(p) == null || isThereOpponentPiece(p));
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
		Position p = new Position(position.getRow(), position.getColumn());
		// up left
		p = new Position(position.getRow() - 2, position.getColumn() - 1);
		if (canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		// left up
		p = new Position(position.getRow() - 1, position.getColumn() - 2);
		if (canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		// up right
		p = new Position(position.getRow() - 2, position.getColumn() + 1);
		if (canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		// right up
		p = new Position(position.getRow() - 1, position.getColumn() + 2);
		if (canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		// down left
		p = new Position(position.getRow() + 2, position.getColumn() - 1);
		if (canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		// left down
		p = new Position(position.getRow() + 1, position.getColumn() - 2);
		if (canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		// down right
		p = new Position(position.getRow() + 2, position.getColumn() + 1);
		if (canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		// right down
		p = new Position(position.getRow() + 1, position.getColumn() + 2);
		if (canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		return mat;
	}
}
