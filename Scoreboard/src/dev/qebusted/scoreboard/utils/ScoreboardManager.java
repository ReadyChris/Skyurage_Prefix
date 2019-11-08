package dev.qebusted.scoreboard.utils;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Scoreboard;

public class ScoreboardManager {

    public static void setScoreboard(Player player) {

        Scoreboard scoreboard = Bukkit.getScoreboardManager().getMainScoreboard();
        Objective obj = scoreboard.getObjective("aaa") != null ? scoreboard.getObjective("aaa") : scoreboard.registerNewObjective("aaa", "skyurage");

        obj.setDisplaySlot(DisplaySlot.SIDEBAR);
        obj.setDisplayName("§b§lSkyurage");

        obj.getScore("§a").setScore(6);
        obj.getScore("§8┌             §8┐").setScore(5);
        obj.getScore("  §6§lTeamSpeak§6³").setScore(4);
        obj.getScore("  §7➥ §bSkyurage.de").setScore(3);
        obj.getScore("§8└             §8┘").setScore(2);
        obj.getScore("§b").setScore(1);

        player.setScoreboard(scoreboard);

    }

}
