package racing.domain;

public class TryNumber {

  private final int tryNumber;

  public TryNumber(int tryNumber) {
    if (tryNumber < 0) {
      throw new NumberFormatException();
    }
    this.tryNumber = tryNumber;
  }

  public int getTryNumber() {
    return tryNumber;
  }

}
