package com.chifou.disablechat;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
	
	
	@Override
	public void onEnable() {
		System.out.println("------------------ ");
		System.out.println("DisableChat has been enabled, maked by chifou");
		System.out.println("------------------ ");
		
		//true = chat work ; false = chat don't work
		
		Hash.isChatEnabled.clear();
		Hash.isChatEnabled.put(true, true);
		
		getCommand("togglechat").setExecutor(new ChatCommand());
		
		getServer().getPluginManager().registerEvents(new Events(), this);
		
	}
	@Override
	public void onDisable() {
		
		Hash.isChatEnabled.clear();
		
		System.out.println("------------------ ");
		System.out.println("DisableChat has been disabled, maked by chifou");
		System.out.println("------------------ ");
	}

}
