
package com.chess.engine.board;
//com.chess.engine.pieces

import com.chess.engine.pieces.Piece;

import java.util.HashMap;
import java.util.Map;

public abstract class Tile {

    protected final int tileCoordinate;

    private static Map<Integer, EmptyTile> createAllPossibleEmptyTiles;
    private static final Map<Integer, EmptyTile> Empty_Tiles = createAllPossibleEmptyTiles{




            final Map<Integer, EmptyTile> emptyTileMap = new HashMap<>();
            for(int i = 0; i < 64; i++) {
                emptyTileMap.put(i, new EmptyTile(i));

            }

            return ImmutableMap.copyOf(emptyTileMap);
    }



    Tile(int tileCoordinate){
        this.tileCoordinate = tileCoordinate;

    }

    public abstract boolean isTileOccupied();

    public abstract Piece getPiece();

    public static final class EmptyTile extends Tile{

        EmptyTile(final int coordinate){
            super(coordinate);

        }

        public boolean isTileOccupied(){
            return false;

        }
        public Piece getPiece(){
            return null;
        }
    }

    public static final class OccupiedTile extends Tile {

        private final Piece pieceOnTile;

        OccupiedTile(int tileCoordinate, Piece pieceOnTile){
            super(tileCoordinate);
            this.pieceOnTile= pieceOnTile;
        }

        public boolean isTileOccupied(){
            return true;
        }

        public Piece getPiece(){
            return this.pieceOnTile;

        }
    }

}
