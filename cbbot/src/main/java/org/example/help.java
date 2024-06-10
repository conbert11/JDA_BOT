package org.example;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.awt.*;

public class help extends ListenerAdapter {
    @Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent event) {
        if (event.getName().equals("help")) {

            EmbedBuilder e = new EmbedBuilder()
                    .setColor(Color.cyan)
                    .setDescription("## `❓` › HELP \n" +
                            "Hier findest du die Commands vom CB Bot! \n\n" +
                            "1. </avatar:1249772575073243211> - Zeige denn Avatar von einem Benutzer an!\n\n" +
                            "2. </ban:1249772575073243209> - Banne einen Mitglied!\n\n" +
                            "3. </kick:1249772575073243208> - Kicke einen Mitglied!\n\n" +
                            "__**Weitere Commands sind bald verfügbar!**__")
                    .setThumbnail(variable.logo)
                    .setImage(variable.streifen);

            event.replyEmbeds(e.build()).setEphemeral(true).queue();

        }
    }
}
