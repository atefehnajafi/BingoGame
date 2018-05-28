import java.util.ArrayList;
import java.util.Random;

public class CardClass {

	private int[][] _cardNumber = new int[3][5];

	public void SetCardNumber(int[][] _cardNumber) {
		if (_cardNumber != null)
			this._cardNumber = _cardNumber;
		else
			System.out.println("Cart Is Null");
	}

	public int[][] GetCardNumber() {
		return _cardNumber;
	}

	public CardClass() {
		// TODO Auto-generated constructor stub
	}

	public CardClass(int[][] _cardNumber) {
		// TODO Auto-generated constructor stub
		this._cardNumber = _cardNumber;
	}

	CardClass AddCard() {
		// Assign a value for Each Card
		Random _random = new Random();
		CardClass _newCard = new CardClass();
		_cardNumber = new int[3][5];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				int _number = _random.nextInt(90) + 1;
				_cardNumber[i][j] = _number;
			}
		}

		_newCard.SetCardNumber(GetCardNumber());

		return _newCard;
	}

	// CardClass Method
	public void MarkNumber(int _randomNumberForPlayStart,CardClass[] _tempCardList) {
		for (int m = 0; m < _tempCardList.length; m++) {
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 5; j++) {
					if (_tempCardList[m]._cardNumber[i][j]== _randomNumberForPlayStart) {						
						_tempCardList[m]._cardNumber[i][j] = -1;
					}
				}
			}

		}
	}

	public boolean IsMarked(int _row, int _coulmn) {
		if(_cardNumber[_row][_coulmn]==-1)
			return true;
		return false;
	}

}
