package org.example;

import net.dv8tion.jda.api.EmbedBuilder;
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
import java.awt.*;

public class kick extends ListenerAdapter {
    @Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent event) {
        if (event.getName().equals("kick")) {
            if (event.getMember().hasPermission(Permission.KICK_MEMBERS)) {

                Member m = event.getOption("user").getAsMember();

                m.kick().queue();

                event.reply( m.getAsMention() + " wurde Erfolgreich aus dem Server gekickt!").setEphemeral(true).queue();
            }
        }
    }

}
