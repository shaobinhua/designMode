package com.binhua.command.example02;

/**
 * Created by shaobinhua on 2017/4/11.
 */
public class RewindCommand implements AudioCommand{

    private AudioPlayer audioPlayer;

    public RewindCommand(AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }

    @Override
    public void executor() {
        audioPlayer.rewind();
    }
}
