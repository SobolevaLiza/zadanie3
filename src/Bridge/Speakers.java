package Bridge;

public class Speakers implements MusicDevice {
  @Override
  public void playMusic() {
    System.out.println("Колонки играют музыку");
  }

  @Override
  public void stopMusic() {
    System.out.println("Колонки прекращают воспроизведение музыки");
  }
}
