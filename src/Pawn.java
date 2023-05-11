public class Pawn extends Piece{

    public Pawn(int x, int y, Side side, Board board) {
        super(x, y, side, board);
    }

    @Override
    public boolean canMove(int destX, int destY) {

        Piece destP = this.board.get(destX,destY);

        if(this.y == 6 && this.getSide() == Side.WHITE){
            if(this.x == destX && (this.y - 2 == destY || this.y -1 == destY)){
                if(destP != null){
                    return false;
                }
                return true;
            }
        }else {
            if (this.y == 1 && this.getSide() == Side.BLACK) {
                if (this.x == destX && (this.y + 2 == destY || this.y + 1 == destY)) {
                    if(destP != null){
                        return false;
                    }
                    return true;
                }
            } else {
                if (this.getSide() == Side.BLACK && this.x == destX && this.y + 1 == destY) {
                    if(destP != null){
                        return false;
                    }
                    return true;
                } else {
                    if(this.getSide() == Side.WHITE && this.x == destX && this.y - 1 == destY){
                        if(destP != null){
                            return false;
                        }
                        return true;
                    }
                }
            }
        }


        if(this.getSide() == Side.BLACK && ((destX == this.x+1 && destY == this.y+1) || (destX == this.x-1 && destY == this.y+1)) && destP != null){
            return true;
        }
        if(this.getSide() == Side.WHITE && ((destX == this.x+1 && destY == this.y-1) || (destX == this.x-1 && destY == this.y-1)) && destP != null){
            return true;
        }

        return false;
    }

    @Override
    public String getSymbol() {
        return this.getSide() == Side.BLACK ? "♟" : "♙";
    }


}
