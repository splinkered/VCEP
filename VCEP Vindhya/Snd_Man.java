import java.io.File;
import javax.sound.sampled.*;
import java.util.concurrent.TimeUnit;

public class Snd_Man
{
    //play the end
    
    //play beep
   public void ptb(){
       try {
            Clip clip = AudioSystem.getClip();
            AudioInputStream inputStream = AudioSystem.getAudioInputStream(
            Snd_Man.class.getResourceAsStream("./res/audio/beepf.wav"));
            clip.open(inputStream);
            clip.start(); 
            TimeUnit.SECONDS.sleep(1);
      } catch (Exception e) {
          System.err.println(e.getMessage());
      }
    }
   //play thank you
   public void ptt(){
       try{
       String soundName = "./res/audio/tkuf.wav";    
       AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundName).getAbsoluteFile());
       Clip clip = AudioSystem.getClip();
       clip.open(audioInputStream);
       clip.start();}catch(Exception e){}
   }
}
