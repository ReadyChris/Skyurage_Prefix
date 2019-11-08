package dev.qebusted.scoreboard;

import dev.qebusted.scoreboard.listener.JoinListener;
import org.bukkit.plugin.java.JavaPlugin;

public class Scoreboard extends JavaPlugin {

    @Override
    public void onEnable() {
        registerListener();
        getLogger().info(getDescription().getName() + " aktiviert");
    }

    @Override
    public void onDisable() {
        getLogger().info(getDescription().getName() + " deaktiviert");
    }

    private void registerListener() {
        new JoinListener(this);
    }

}
