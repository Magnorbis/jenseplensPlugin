package me.jenseplens.jenseplensPlugin;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	public void onEnable() {}
	
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        //staff Command
        if(cmd.getName().equalsIgnoreCase("staff")) {
            sender.sendMessage(ChatColor.GREEN.toString() + "Eigenaar: jenseplens");
            sender.sendMessage(ChatColor.GREEN.toString() + "Developer: SplashIV");
            sender.sendMessage(ChatColor.GREEN.toString() + "Bouwer: MelsBov");
        }       
        //jenseplens Command
        if(cmd.getName().equalsIgnoreCase("jenseplens")) {
            sender.sendMessage(ChatColor.GREEN.toString() + "jenseplens is de eigenaar van deze server");
        }
        //plugin Reload Command
        if(cmd.getName().equalsIgnoreCase("jenseplenspluginreload") && sender.hasPermission("jenseplensplugin.reload")) {
            this.reloadConfig();
            sender.sendMessage("Toppie, gereload.");
        }
        if(!(sender instanceof Player)) {
            sender.sendMessage("Dit commando kan niet worden uitgevoerd door de console!");
            return true;
        }
        Player p = (Player) sender;
        

        //locatie Command
        if(cmd.getName().equalsIgnoreCase("locatie")) {
            double spelerx = p.getLocation().getBlockX();
            double spelery = p.getLocation().getBlockY();
            double spelerz = p.getLocation().getBlockZ();
            p.sendMessage(ChatColor.GREEN.toString() + "x: " + spelerx + " - y: "+ spelery + " - z: " + spelerz);
        }
            
        return true;
        }
    }