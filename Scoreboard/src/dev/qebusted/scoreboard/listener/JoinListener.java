package dev.qebusted.scoreboard.listener;

import dev.qebusted.scoreboard.Scoreboard;
import dev.qebusted.scoreboard.utils.ScoreboardManager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinListener implements Listener {

    public JoinListener(Scoreboard main) {
        main.getServer().getPluginManager().registerEvents(this, main);
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        ScoreboardManager.setScoreboard(event.getPlayer());
    }

}
