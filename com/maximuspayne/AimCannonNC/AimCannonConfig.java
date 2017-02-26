package com.maximuspayne.AimCannonNC;

import java.io.File;

import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.Plugin;

public class AimCannonConfig {
		public static int timeout;
		public static boolean canturn;
		public static float speed;
		public static boolean noaimdown;
		Plugin plugin;
		public static void initialize(File dataFolder, Plugin plugin) {
		        if(!dataFolder.exists()) {
		            dataFolder.mkdirs();
		        }
		      
		        //File configFile  = new File(dataFolder, settingsFile);
		       // BetterConfig config = new BetterConfig(configFile, plugin);
		        
		        
		        File config = new File(dataFolder, "config.yml");
		        YamlConfiguration ymlconfig = YamlConfiguration.loadConfiguration(config);
		         
		        timeout = ymlconfig.getInt("timeout", 4000);
		        speed = ((float)ymlconfig.getInt("speed", 200)) / 100;
		        canturn = ymlconfig.getBoolean("canturn", true);
		        noaimdown = ymlconfig.getBoolean("noaimdown", true);
		        
		        
		        /*
		        File config = new File(dataFolder, "config.yml");
		    	YamlConfiguration ymlconfig = new YamlConfiguration();
		    	ymlconfig.set("BroadcastTime", 300000);
		    	ymlconfig.set("useiConomy", false);
		    	ymlconfig.set("bidtime", 420000);
		    	ymlconfig.save(config);*/
		    	

		    }
	}
