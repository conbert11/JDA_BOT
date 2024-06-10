package org.example;


import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.requests.GatewayIntent;
import net.dv8tion.jda.api.utils.ChunkingFilter;
import net.dv8tion.jda.api.utils.MemberCachePolicy;
import net.dv8tion.jda.api.utils.cache.CacheFlag;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static String prefix = "cb!";
    public static JDA bot;


    public static void main(String[] args) {

        JDABuilder jda = JDABuilder.createDefault(secrets.TOKEN)
                .setStatus(OnlineStatus.ONLINE)
                .setActivity(Activity.playing("mit coolen Usern :)"))
                .setChunkingFilter(ChunkingFilter.ALL)
                .setMemberCachePolicy(MemberCachePolicy.ALL)
                .enableIntents(GatewayIntent.GUILD_MEMBERS, GatewayIntent.GUILD_PRESENCES, GatewayIntent.MESSAGE_CONTENT)
                .enableCache(CacheFlag.ONLINE_STATUS)
                .addEventListeners(
                        new ban(),
                        new kick(),
                        new avatar(),
                        new register()
                );



        JDA bot = jda.build();
        System.out.println("CB Bot wurde gestart!");
        System.out.println("Prefix: " + prefix);
    }
}