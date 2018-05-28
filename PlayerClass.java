
public class PlayerClass {
	private String _playerName;
	private CardClass[] _cardList = new CardClass[2];

	CardClass _cardObj = new CardClass();

	public void SetPlayerName(String _playerName) {
		if (_playerName.isEmpty())
			System.out.println("Player Name is Null");
		else
			this._playerName = _playerName;
	}

	public String GetPlayerName() {
		return _playerName;
	}

	public void SetCatdList(CardClass[] _cardLsit) {
		if (_cardLsit == null)
			System.out.println("Card Is Empty");
		else
			this._cardList = _cardLsit;
	}

	public CardClass[] GetCardList() {
		return _cardList;
	}

	// PlayerClass Methods
	PlayerClass AddPlayer() {
		PlayerClass _newPlayer = new PlayerClass();
		_newPlayer.SetPlayerName(GetPlayerName());
		_newPlayer.SetCatdList(GetCardList());
		return _newPlayer;
	}

	public boolean IsWinner(CardClass[] _cardList) {
		int _count = 0;
		for (int m = 0; m < _cardList.length; m++) {
			if(_count==5)break;
			_cardObj = _cardList[m];
			for (int i = 0; i < 3; i++) {
				_count = 0;
				start: for (int j = 0; j < 5; j++) {
					if (_cardObj.IsMarked(i, j)) {
						_count++;
					}
				
				}
				if(_count ==5)
					break;
			}
		}

		if (_count == 5)
			return true;
		else
			return false;

	}

	public void MarkNumber() {

	}
}
