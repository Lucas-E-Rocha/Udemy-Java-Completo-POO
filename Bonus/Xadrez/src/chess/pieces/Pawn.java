package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Pawn extends ChessPiece {

	public Pawn(Board board, Color color) {
		super(board, color);
	}

	@Override
	public String toString() {
		return "P";
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
		Position p = new Position(position.getRow(), position.getColumn());
		// White
		if (getColor() == Color.WHITE) {
			// Up 1
			p = new Position(position.getRow() - 1, position.getColumn());
			if (canMove(p)) {
				mat[p.getRow()][p.getColumn()] = true;
				// Up 2
				if (getMoveCount() == 0) {
					p = new Position(position.getRow() - 2, position.getColumn());
					if (canMove(p)) {
						mat[p.getRow()][p.getColumn()] = true;
					}
				}
			}
			// Diagonal left
			p = new Position(position.getRow() - 1, position.getColumn() - 1);
			if (canMoveOpponentExists(p)) {
				mat[p.getRow()][p.getColumn()] = true;
			}
			// Diagonal Right
			p = new Position(position.getRow() - 1, position.getColumn() + 1);
			if (canMoveOpponentExists(p)) {
				mat[p.getRow()][p.getColumn()] = true;
			}
		}
		// Black
		else {
			// Up 1
			p = new Position(position.getRow() + 1, position.getColumn());
			if (canMove(p)) {
				mat[p.getRow()][p.getColumn()] = true;
				// Up 2
				if (getMoveCount() == 0) {
					p = new Position(position.getRow() + 2, position.getColumn());
					if (canMove(p)) {
						mat[p.getRow()][p.getColumn()] = true;
					}
				}
			}
			// Diagonal left
			p = new Position(position.getRow() + 1, position.getColumn() - 1);
			if (canMoveOpponentExists(p)) {
				mat[p.getRow()][p.getColumn()] = true;
			}
			// Diagonal Right
			p = new Position(position.getRow() + 1, position.getColumn() + 1);
			if (canMoveOpponentExists(p)) {
				mat[p.getRow()][p.getColumn()] = true;
			}
		}
		return mat;
	}
}
