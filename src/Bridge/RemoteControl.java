package Bridge;

public abstract class RemoteControl {
  protected MusicDevice musicDevice;

  public RemoteControl(MusicDevice musicDevice) {
    this.musicDevice = musicDevice;
  }

  public abstract void pressPlay();

  public abstract void pressStop();
}
