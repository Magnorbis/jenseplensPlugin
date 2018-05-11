/*
Copyright 2018 jenseplens

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 */

package me.jenseplens.jenseplensPlugin;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class JenseplensPlugin extends JavaPlugin {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        // staff Command
        if(cmd.getName().equalsIgnoreCase("staff")) {
            sender.sendMessage(ChatColor.GREEN.toString() + "Eigenaar: jenseplens");
            sender.sendMessage(ChatColor.GREEN.toString() + "Administrator: SplashIV");
            sender.sendMessage(ChatColor.GREEN.toString() + "Developer: The947thTokay");
            sender.sendMessage(ChatColor.GREEN.toString() + "Bouwer: MelsBov");
        }

        // locatie Command (can only be executed by players)
        else if(sender instanceof Player && cmd.getName().equalsIgnoreCase("locatie")) {
            Player p = (Player) sender;
            int spelerx = p.getLocation().getBlockX();
            int spelery = p.getLocation().getBlockY();
            int spelerz = p.getLocation().getBlockZ();
            p.sendMessage(ChatColor.GREEN.toString() + "x: " + spelerx + " - y: "+ spelery + " - z: " + spelerz);
        }

        // Executed by console, cannot find location
        else {
            sender.sendMessage("Dit commando kan niet worden uitgevoerd door de console!");
        }

        return true;
        }
    }
