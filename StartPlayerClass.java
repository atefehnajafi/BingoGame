import java.util.Random;

public class StartPlayerClass {
	
	/*
	
	*/
	void StartAgain(PlayerClass[] _playerList)
	{
		BingoClass _bingoObj = new BingoClass(_playerList);
		Random _random = new Random();
		
		int _randomNumberForPlayStart = _random.nextInt(90) + 1;
		String _winPlayer = _bingoObj.Play(_randomNumberForPlayStart);
		while(_winPlayer!= "")
		{
			System.out.println("");
			System.out.println("WOOOOOOOOOOOOOOOOOOOOOOOOW");
			System.out.println("Wins :" +_winPlayer);
			break;
		}
		
	}
	
	void ShowCard(CardClass[] _cardList,PlayerClass[] _playerList,int _random)
	{
		System.out.println("");
		
		System.out.println(" *********** Random Number in This Game is : " + _random + " ***********************8");
		for(int i=0;i<4;i++)
		{
			int _sForPlayerCardNumber=0;
			for(int m=0;m<_cardList.length;m++)
			{
				_sForPlayerCardNumber++;
				System.out.println("");
				System.out.println("cart number " + _sForPlayerCardNumber  + " For Player " + _playerList[i].GetPlayerName());
				for (int s = 0; s < 3; s++) {
					System.out.println("");
					for (int j = 0; j < 5; j++) {
						System.out.print(	_playerList[i].GetCardList()[m].GetCardNumber()[s][j]+" ");
					

					}
				}
			}
		}
		
	}
}
