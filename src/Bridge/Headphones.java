package Bridge;

public class Headphones implements MusicDevice {
  @Override
  public void playMusic() {
    System.out.println("Наушники воспроизводят музыку");
  }

  @Override
  public void stopMusic() {
    System.out.println("Наушники прекращают воспроизведение музыки");
  }
}
