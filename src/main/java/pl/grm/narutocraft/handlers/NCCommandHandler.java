package pl.grm.narutocraft.handlers;

import java.util.*;

import net.minecraft.command.*;
import net.minecraftforge.client.*;
import pl.grm.narutocraft.commands.util.*;

public class NCCommandHandler {
	private Map<String, NCCommandBase>	ncCommandsMap;
	private NCCommandExecutor			executor;
	private ServerCommandManager		sManager;
	private ClientCommandHandler		cManager;
	private List<CommandEnum>			commands	= new ArrayList<CommandEnum>();
	
	public NCCommandHandler() {
		ncCommandsMap = new HashMap<>();
	}
	
	public NCCommandHandler(ServerCommandManager manager) {
		this();
		this.sManager = manager;
	}
	
	public NCCommandHandler(ClientCommandHandler manager) {
		this();
		this.cManager = manager;
	}
	
	public void registerCommands(boolean both) {
		setupCommands(both);
	}
	
	public void setupCommands(boolean both) {
		for (CommandEnum comm : CommandEnum.values()) {
			if (comm.isExecutve()) {
				String name = comm.getName();
				ICommand instance = null;
				try {
					instance = comm.getInstance();
				}
				catch (InstantiationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				ncCommandsMap.put(name, (NCCommandBase) instance);
				commands.add(comm);
				if (both) {
					setupClientCommand(instance);
				} else {
					setupServerCommand(instance);
				}
			}
		}
	}
	
	private void setupServerCommand(ICommand instance) {
		sManager.registerCommand(instance);
	}
	
	private void setupClientCommand(ICommand instance) {
		cManager.registerCommand(instance);
	}
	
	public Map<String, NCCommandBase> getNCCommandsMap() {
		return this.ncCommandsMap;
	}
	
}