package com.binhua.command.example02;

import com.binhua.command.example02.extend.MacroComandImp;
import com.binhua.command.example02.extend.MacroCommand;

/**
 * Created by shaobinhua on 2017/4/11.
 */
public class User {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        Keypad keypad = new Keypad();

        AudioCommand play = new PlayCommand(audioPlayer);
        AudioCommand rewind = new RewindCommand(audioPlayer);
        AudioCommand stop = new StopCommand(audioPlayer);
        MacroCommand macro = new MacroComandImp();


        keypad.setPlayCommand(play);
        keypad.setRewindCommand(rewind);
        keypad.setStopCommand(stop);
        keypad.setMacroCommand(macro);

        keypad.play();
        macro.add(play);
        keypad.stop();
        macro.add(stop);
        keypad.rewind();
        macro.add(rewind);
        keypad.macro();


    }
}
