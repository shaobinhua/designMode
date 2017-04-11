package com.binhua.command.example02;

import com.binhua.command.example02.extend.MacroCommand;

/**
 * Created by shaobinhua on 2017/4/11.
 */
public class Keypad {


    private AudioCommand playCommand;
    private AudioCommand rewindCommand;
    private AudioCommand stopCommand;
    private MacroCommand macroCommand;

    public AudioCommand getRewindCommand() {
        return rewindCommand;
    }

    public void setRewindCommand(AudioCommand rewindCommand) {
        this.rewindCommand = rewindCommand;
    }

    public AudioCommand getStopCommand() {
        return stopCommand;
    }

    public void setStopCommand(AudioCommand stopCommand) {
        this.stopCommand = stopCommand;
    }


    public MacroCommand getMacroCommand() {
        return macroCommand;
    }

    public void setMacroCommand(MacroCommand macroCommand) {
        this.macroCommand = macroCommand;
    }

    public AudioCommand getPlayCommand() {
        return playCommand;
    }

    public void setPlayCommand(AudioCommand playCommand) {
        this.playCommand = playCommand;
    }


    public void play() {
        playCommand.executor();
       // macroCommand.add(playCommand);
    }

    public void stop() {
        stopCommand.executor();
        //macroCommand.add(stopCommand);
    }

    public void rewind() {
        rewindCommand.executor();
        //macroCommand.add(rewindCommand);
    }

    public void macro() {
        macroCommand.executor();
    }
}
