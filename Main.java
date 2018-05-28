import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner _strsc = new Scanner(System.in);


		CardClass[] _cardList = new CardClass[2];
		PlayerClass _playerObj = new PlayerClass();
		PlayerClass[] _playerList = new PlayerClass[4];
	

		Random _random = new Random();

		
		/*BingoClass _bingoObj = new BingoClass(_playerList);
		Random _random = new Random();
		*/
		for (int i = 0; i < 4; i++) {
			System.out.println("");
			System.out.println("Please Enter Player Name");
			_playerObj.SetPlayerName(_strsc.nextLine());
			// new _cardlist for new player
			_cardList = new CardClass[2];

			// List of cards This Player
			for (int j = 0; j < 2; j++) {
				// _cardList.add(j, _playerObj._cardObj.AddCard());
				_cardList[j] = _playerObj._cardObj.AddCard();
			}
			
			_playerObj.SetCatdList(_cardList);
			_playerList[i] = _playerObj.AddPlayer();
			// _playerList.add(i, _playerObj.AddPlayer());
			int _sForPlayerCardNumber=0;
			for(int m=0;m<_cardList.length;m++)
			{
				_sForPlayerCardNumber++;
				System.out.println("");
				System.out.println("cart number " + _sForPlayerCardNumber  + " For Player " + _playerList[i].GetPlayerName());
				for (int s = 0; s < 3; s++) {
					System.out.println("");
					for (int j = 0; j < 5; j++) {
						System.out.print(_cardList[m].GetCardNumber()[s][j]+" ");

					}
				}
			}
			
			
			
		}
		
		//start.StartAgain(_playerList);
		BingoClass _bingoObj = new BingoClass(_playerList);
			int _randomNumberForPlayStart = _random.nextInt(90) + 1;
			String _winPlayer = _bingoObj.Play(_randomNumberForPlayStart);
			System.out.println(_winPlayer);
	}

}
