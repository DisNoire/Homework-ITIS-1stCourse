package febrary16.audio.processing;

import febrary16.entities.Track;

import javax.sound.sampled.UnsupportedAudioFileException;

public class PlayerFactory {

    public Player getPlayer(Track track) throws UnsupportedAudioFileException {
        final String format = track.getFormat();

        switch (format) {
            case "mp3":
                return MP3.getInstance(track);
            case "wav":
                return Wav.getInstance(track);
            case "flac":
                return Flac.getInstance(track);
        }

        throw new UnsupportedAudioFileException();
    }
}
