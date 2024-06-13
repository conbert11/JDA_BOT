package org.example;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.awt.*;

public class serverinfo extends ListenerAdapter {
    @Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent ereignis) {
        if (ereignis.getName().equals("serverinfo")) {

            EmbedBuilder e = new EmbedBuilder()
                    .setColor(Color.BLACK)
                    .setImage(variable.streifen)
                    .setThumbnail(ereignis.getGuild().getIconUrl())
                    .setDescription("## SERVERINFOS")
                    .addField("Name", ereignis.getGuild().getName(), true)
                    .addField("ID", ereignis.getGuild().getId(), true)
                    .addField("Owner", ereignis.getGuild().getOwner().getAsMention(), true);


            ereignis.replyEmbeds(e.build()).setEphemeral(true).queue();
        }
    }
}
