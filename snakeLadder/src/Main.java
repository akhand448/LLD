import com.snakeLadder.akhand.Game;

public class Main {
    public static void main(String[] args) {

        int n=1;
        while(n>0){
            Game game = new Game(1,10,2,5,3);
            game.startGame();
            n-=1;
        }
    }
}