package reinei.CD;

import net.minecraftforge.common.MinecraftForge;

import reinei.CD.events.CommandEventHandler;
import reinei.CD.lib.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, version = Reference.VERSION, name = Reference.NAME)
public class ConsoleDebugger
{
	private CommandEventHandler commandHandler = new CommandEventHandler();
	
	@Instance
	public static ConsoleDebugger instance;
	
	@PreInit
	public void preInit(FMLPreInitializationEvent event)
	{
		
	}
	
	@Init
	public void Init(FMLInitializationEvent event)
	{
		MinecraftForge.EVENT_BUS.register(commandHandler);
	}
	
	@PostInit
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
}
