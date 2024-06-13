package org.example;

import net.dv8tion.jda.api.events.session.ReadyEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.interactions.commands.OptionType;
import net.dv8tion.jda.api.interactions.commands.build.CommandData;
import net.dv8tion.jda.api.interactions.commands.build.Commands;
import net.dv8tion.jda.api.interactions.commands.build.OptionData;

import java.util.ArrayList;
import java.util.List;

public class register extends ListenerAdapter {

    @Override
    public void onReady(ReadyEvent event) {
        List<CommandData> commandData = new ArrayList<>();

        OptionData userkick = new OptionData(OptionType.USER, "user", "Wähle denn User", true);
        commandData.add(Commands.slash("kick", "Kicke einen Mitglied").addOptions(userkick));

        OptionData userban = new OptionData(OptionType.USER, "user", "Wähle denn User", true);
        commandData.add(Commands.slash("ban", "Banne einen Mitglied").addOptions(userban));

        OptionData usergetavatar = new OptionData(OptionType.USER, "user", "Wähle denn User", true);
        commandData.add(Commands.slash("avatar", "Bekomme denn Avatar vom Mitglied").addOptions(usergetavatar));

        commandData.add(Commands.slash("help", "Zeige alle Commands an!"));

        commandData.add(Commands.slash("serverinfo", "Erhalte infos über denn Server!"));


        event.getJDA().updateCommands().addCommands(commandData).queue();
    }
}
