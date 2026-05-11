package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.Color;

public class Pawn extends ChessPiece {

	private ChessMatch chessMatch;

	public Pawn(Board board, Color color, ChessMatch chessMatch) {
		super(board, color);
		this.chessMatch = chessMatch;
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
			// En passant
			if (position.getRow() == 3) {
				Position left = new Position(position.getRow(), position.getColumn() - 1);
				if (getBoard().positionExists(left) && isThereOpponentPiece(left)
						&& getBoard().piece(left) == chessMatch.getEnPassantVulnerable()) {
					mat[left.getRow() - 1][left.getColumn()] = true;
				}
				Position right = new Position(position.getRow(), position.getColumn() + 1);
				if (getBoard().positionExists(right) && isThereOpponentPiece(right)
						&& getBoard().piece(right) == chessMatch.getEnPassantVulnerable()) {
					mat[right.getRow() - 1][right.getColumn()] = true;
				}
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

			// En passant
			if (position.getRow() == 4) {
				Position left = new Position(position.getRow(), position.getColumn() - 1);
				if (getBoard().positionExists(left) && isThereOpponentPiece(left)
						&& getBoard().piece(left) == chessMatch.getEnPassantVulnerable()) {
					mat[left.getRow() + 1][left.getColumn()] = true;
				}
				Position right = new Position(position.getRow(), position.getColumn() + 1);
				if (getBoard().positionExists(right) && isThereOpponentPiece(right)
						&& getBoard().piece(right) == chessMatch.getEnPassantVulnerable()) {
					mat[right.getRow() + 1][right.getColumn()] = true;
				}
			}
		}
		return mat;
	}
}
