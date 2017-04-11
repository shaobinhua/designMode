package com.binhua.command.example02.extend;

import com.binhua.command.example02.AudioCommand;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shaobinhua on 2017/4/11.
 */
public class MacroComandImp implements MacroCommand {

    private List<AudioCommand> commandList = new ArrayList<>();

    @Override
    public void executor() {
        for (AudioCommand command : commandList) {
            command.executor();
        }
    }

    @Override
    public void add(AudioCommand command) {
        commandList.add(command);
    }

    @Override
    public void remove(AudioCommand command) {
        commandList.remove(command);
    }
}
