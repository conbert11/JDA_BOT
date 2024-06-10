package org.example;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.Permission;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.awt.*;

public class avatar extends ListenerAdapter {
    @Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent event) {
        if (event.getName().equals("avatar")) {
            Member m = event.getOption("user").getAsMember();

            EmbedBuilder e = new EmbedBuilder()
                    .setImage(m.getEffectiveAvatarUrl())
                    .setColor(Color.BLACK)
                    .setDescription("### AVATAR VON " + m.getAsMention())
                    .setFooter("Angefragt von " + event.getMember().getEffectiveName(), event.getMember().getEffectiveAvatarUrl());

            event.getChannel().sendMessageEmbeds(e.build()).queue();
            event.reply("erfolgreich!").setEphemeral(true).queue();
        }
    }
}
