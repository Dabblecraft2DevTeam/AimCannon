package com.maximuspayne.AimCannonNC;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;


public class AimCannon extends JavaPlugin{
	private final AimCannonPlayerListener playerListener = new AimCannonPlayerListener(this);
	public static List<OneCannon> cannons = new ArrayList<OneCannon>();
	
	public static List<OneCannon> getCannons() {
		return cannons;
	}


	public void onDisable() {
		System.out.println("[AimCannonNC] Disabled");
	}

	@Override
	//When the plugin is enabled this method is called.
	public void onEnable() {
		PluginManager pm = getServer().getPluginManager();
		
        pm.registerEvents(playerListener, this);
		PluginDescriptionFile pdfFile = this.getDescription();
        //Print that the plugin has been enabled!
        System.out.println( "["+ pdfFile.getName() + "] version " + pdfFile.getVersion() + " is enabled!" );
        AimCannonConfig.initialize(getDataFolder(), this);
	
	}
}
