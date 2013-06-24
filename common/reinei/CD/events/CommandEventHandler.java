package reinei.CD.events;

import net.minecraftforge.event.CommandEvent;
import net.minecraftforge.event.EventPriority;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.ServerChatEvent;

public class CommandEventHandler
{
	@ForgeSubscribe(priority = EventPriority.HIGHEST)
	public void CommandIncoming(CommandEvent ev)
	{
		System.out.println(ev.command.getCommandName());
	}
	
	@ForgeSubscribe(priority = EventPriority.HIGHEST)
	public void CommandIncoming(ServerChatEvent ev)
	{
		if (ev.message.startsWith("/&"))
		{
			System.out.println("Received a Message with the right signature.");
		}
	}
}
