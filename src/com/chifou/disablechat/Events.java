package com.chifou.disablechat;

import java.util.Map.Entry;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatEvent;

@SuppressWarnings("deprecation")
public class Events implements Listener {
	
	@EventHandler
	public void onChat(PlayerChatEvent event) {
		
		Player player = event.getPlayer();
		
		for(Entry<Boolean, Boolean> element : Hash.isChatEnabled.entrySet()) {
			if(element.getKey() == false && element.getValue() == false) {
				
				if(player.isOp() == true) {
					
				} else if(player.isOp() == false) {
					
					event.setCancelled(true);
					
					player.sendMessage("§6DisableChat§7:§f You can't chat, the chat is disabled");
					
				}
				
			} else if(element.getKey() == true && element.getValue() == true) {
				
				
				
			}
		}
	}

}
