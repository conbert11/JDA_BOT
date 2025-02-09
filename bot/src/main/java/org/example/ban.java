package org.example;

import net.dv8tion.jda.api.Permission;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.interaction.ModalInteractionEvent;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.interactions.components.text.TextInput;
import net.dv8tion.jda.api.interactions.components.text.TextInputStyle;
import net.dv8tion.jda.api.interactions.modals.Modal;

import javax.swing.text.html.Option;
import java.util.concurrent.TimeUnit;

public class ban extends ListenerAdapter {
    @Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent event) {
        if (event.getName().equals("ban")) {
            if (event.getMember().hasPermission(Permission.BAN_MEMBERS)) {

                Member m = event.getOption("user").getAsMember();

                m.ban(7 ,TimeUnit.DAYS).queue();

                event.reply(m.getAsMention() + " wurde Erfolgreich aus dem Server gebannt!").setEphemeral(true).queue();
            }
        }
    }

}
