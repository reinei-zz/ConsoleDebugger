package reinei.CD.events;

import net.minecraftforge.event.CommandEvent;
import net.minecraftforge.event.EventPriority;
import net.minecraftforge.event.ForgeSubscribe;

public class CommandEventHandler
{
	@ForgeSubscribe(priority = EventPriority.HIGHEST)
	public void CommandIncoming(CommandEvent ev)
	{
		System.out.println(ev.command.getCommandName());
	}
}
