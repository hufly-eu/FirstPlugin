package tech.codemein.firstplugin;

import org.bukkit.plugin.java.JavaPlugin;
import tech.codemein.firstplugin.commands.HelloCommand;

public final class FirstPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("hello").setExecutor(new HelloCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
