public class Knight extends Piece{

    public Knight(int x, int y, Side side, Board board) {
        super(x, y, side, board);
    }

    @Override
    public boolean canMove(int destX, int destY) {

        if(destX > 7 || destX < 0 || destY > 7 || destY < 0){
            return false;
        }
        if((Math.abs(this.x - destX) == 2 && Math.abs(this.y  - destY) == 1) || (Math.abs(this.x - destX) == 1 && Math.abs(this.y  - destY) == 2)){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String getSymbol() {
        return this.getSide() == Side.BLACK ? "♞" : "♘";
    }


}
