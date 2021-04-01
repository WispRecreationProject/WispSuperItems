package dev.yhdiamond.wispsuperitems;

import dev.yhdiamond.wispsuperitems.bstats.Metrics;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class WispSuperItems extends JavaPlugin {
    public static boolean gamestarted = false;
    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new CraftingListener(), this);
        new Metrics(this, 10880);
        getCommand("wispsuperitems").setExecutor(new StartCommand());
        getCommand("wispsuperitems").setTabCompleter(new CommandComplete());
    }

}
