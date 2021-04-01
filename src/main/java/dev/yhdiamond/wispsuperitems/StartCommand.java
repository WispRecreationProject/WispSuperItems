package dev.yhdiamond.wispsuperitems;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class StartCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player){
            Player p = (Player) sender;
            if (sender.hasPermission("wispsuperitems.trigger")){
                if (args.length == 1){
                    if (args[0].equals("start")){
                        WispSuperItems.gamestarted = true;
                        Bukkit.broadcastMessage(ChatColor.GRAY + "[!] Wisp Super Items has " + ChatColor.GREEN + "begun" + ChatColor.GRAY + "!");
                    }
                    else if (args[0].equals("stop")){
                        WispSuperItems.gamestarted = false;
                        Bukkit.broadcastMessage(ChatColor.GRAY + "[!] Wisp Super Items challenge has " + ChatColor.RED + "ended" + ChatColor.GRAY + "!");
                    }
                    else {
                        p.sendMessage(ChatColor.RED + "/wispsuperitems <start/stop>");
                    }
                }
                else {
                    p.sendMessage(ChatColor.RED + "/wispsuperitems <start/stop>");
                }
            }
            else {
                p.sendMessage(ChatColor.RED + "You do not have the permission to run this command!");
            }
        }
        else {
            sender.sendMessage(ChatColor.RED+"This command is for players only!");
        }
        return true;
    }
}
