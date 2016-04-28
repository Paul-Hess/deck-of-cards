class Card{
  String mValue;
  String mSuit;

  public Card(String value, String suit) {
    mValue = value;
    mSuit = suit;
  }

  public String getSuit() {
    return mSuit;
  }

  public String getValue() {
    return mValue;
  }

  public String name(){
    return String.format("%s of %s", mValue, mSuit);
  }
}
