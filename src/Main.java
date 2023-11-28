import Bridge.*;

public class Main {
  public static void main(String[] args) {
    MusicDevice player = new MusicPlayer();
    MusicDevice speakers = new Speakers();
    MusicDevice headphones = new Headphones();

    RemoteControl playerRemote = new MusicRemoteControl(player);
    RemoteControl speakersRemote = new MusicRemoteControl(speakers);
    RemoteControl headphonesRemote = new MusicRemoteControl(headphones);

    System.out.println("Используется музыкальный плеер:");
    playerRemote.pressPlay();
    playerRemote.pressStop();

    System.out.println("\nИспользуются колонки:");
    speakersRemote.pressPlay();
    speakersRemote.pressStop();

    System.out.println("\nИспользуются наушники:");
    headphonesRemote.pressPlay();
    headphonesRemote.pressStop();
  }
}