package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Knight extends ChessPiece{

	public Knight(Board board, Color color) {
		super(board, color);
	}

	@Override
	public String toString() {
		return "N";
	}


	private boolean canMove(Position p) {
		return getBoard().positionExists(p) && !getBoard().thereisAPiece(p);
	}

	private boolean canMoveOpponentExists(Position p) {
		return getBoard().positionExists(p) && isThereOpponentPiece(p);
	}
	
	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
		// up
		Position p = new Position(position.getRow() - 1, position.getColumn());
		while (canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setRow(p.getRow() - 1);
		}
		if (canMoveOpponentExists(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}

		// down
		p = new Position(position.getRow() + 1, position.getColumn());
		while (canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setRow(p.getRow() + 1);
		}
		if (canMoveOpponentExists(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}

		// left
		p = new Position(position.getRow(), position.getColumn() - 1);
		while (canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setColumn(p.getColumn() - 1);
		}
		if (canMoveOpponentExists(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}

		// right
		p = new Position(position.getRow(), position.getColumn() + 1);
		while (canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			p.setColumn(p.getColumn() + 1);
		}
		if (canMoveOpponentExists(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		return mat;
	}
}
