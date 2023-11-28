package Bridge;

public class MusicPlayer implements MusicDevice {
  @Override
  public void playMusic() {
    System.out.println("Плеер воспроизводит музыку");
  }

  @Override
  public void stopMusic() {
    System.out.println("Плеер останавливает воспроизведение музыки");
  }
}
