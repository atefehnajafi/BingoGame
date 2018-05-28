import java.util.ArrayList;
import java.util.Scanner;

import org.omg.CORBA._PolicyStub;

public class BingoClass {

	PlayerClass[] _playerList = new PlayerClass[4];
	StartPlayerClass start = new StartPlayerClass();

	public void SetPlayerLisr(PlayerClass[] _playerList) {
		if (_playerList == null)
			System.out.println("Player List Is Empty");
		else
			this._playerList = _playerList;
	}

	public PlayerClass[] GetPlayerList() {
		return _playerList;
	}

	// BingoClass Constructor
	public BingoClass(PlayerClass[] _playerList) {
		// TODO Auto-generated constructor stub
		this._playerList = _playerList;
	}

	CardClass[] _tempCardList = new CardClass[2];

	ArrayList<String> _playerName = new ArrayList<>();
	String _winPlayer = "";

	// BingoClass Method
	public String Play(int _randomNumberForPlayStart) {
		for (int i = 0; i < _playerList.length; i++) {
			_tempCardList = _playerList[i].GetCardList();

			_playerList[i]._cardObj.MarkNumber(_randomNumberForPlayStart, _tempCardList);


			boolean _checkWin = _playerList[i].IsWinner(_tempCardList);
			if (_checkWin) {
				_winPlayer = _playerList[i].GetPlayerName() + " " + _winPlayer;
				System.out.println("");
				System.out.println("Do You Want See Players Card ? if Yse Click 1");
				Scanner sc = new Scanner(System.in);
				if (sc.nextInt() == 1)
					start.ShowCard(_tempCardList, _playerList, _randomNumberForPlayStart);
				else
					System.out.println("Ok ... Continue ...");
			}
		
		}
		if (_winPlayer == "") {
			start.StartAgain(_playerList);
		} else {
			
		}
		return _winPlayer;
	}
}
