package com.binhua.command.example02.extend;

import com.binhua.command.example02.AudioCommand;

/**
 * Created by shaobinhua on 2017/4/11.
 */
public interface MacroCommand extends AudioCommand {

    void add(AudioCommand command);

    void remove(AudioCommand command);
}
