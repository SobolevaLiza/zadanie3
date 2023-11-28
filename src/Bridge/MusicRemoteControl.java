package Bridge;

public class MusicRemoteControl extends RemoteControl {
  public MusicRemoteControl(MusicDevice musicDevice) {
    super(musicDevice);
  }

  @Override
  public void pressPlay() {
    musicDevice.playMusic();
  }

  @Override
  public void pressStop() {
    musicDevice.stopMusic();
  }
}
