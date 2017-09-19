package level1;

import java.applet.AudioClip;
import java.io.IOException;
import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class cowtimer {
	/*
	 * This is an advanced recipe. There may be more than one line of code for each
	 * instruction. Work in seconds when testing, then change to minutes
	 */

	public static void main(String[] args) throws InterruptedException {
		/* 1. Make a CowTimer, set the time and start it. */
cowtimer cowtimer = new cowtimer();
cowtimer.start();
	}

	int timeStart;
	private int minutes;

	public void cowTimer() {
		int timeSet = setTime();
		start(timeSet);

	}

	public void setTime(int minutes) {
		this.minutes = minutes;
	
		System.out.println("Cow set to " + minutes + " minutes.");
	
	}

	public void start() throws InterruptedException {
		/*
		 * 2. Count down the minutes, print the current minute then sleep for 60 seconds
		 * using Thread.sleep(int milliseconds).
		 */
	setTime(1);
	Thread.sleep(60000);

		speak("MOOOOOOOOOOOOOOOOOOOOOOOO");
		/*
		 * 3. When the timer is finished, use the playSound method to play a moo sound.
		 * You can download one from freesound.org, then drag it into your default
		 * package.
		 */

	}

	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

	private void speak(String stuffToSay) {
		try {
			Runtime.getRuntime().exec("say " + stuffToSay).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
