package com.chifou.disablechat;

import java.util.Map.Entry;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class ChatCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] args) {
		
		
		for(Entry<Boolean, Boolean> element : Hash.isChatEnabled.entrySet()) {
			if(element.getKey() == true && element.getValue() == true) {
				
				Hash.isChatEnabled.clear();
				Hash.isChatEnabled.put(false, false);
				
				
				Bukkit.getServer().broadcastMessage("§6DisableChat§7:§f The chat has been§6 disabled ! ");
				
			} else if(element.getKey() == false && element.getValue() == false) {
				
				Hash.isChatEnabled.clear();
				Hash.isChatEnabled.put(true, true);
				
				
				Bukkit.getServer().broadcastMessage("§6DisableChat§7:§f The chat has been§6 enabled ! ");
			}
			
		}
		return false;
	}

}
