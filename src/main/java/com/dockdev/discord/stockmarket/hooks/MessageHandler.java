package com.dockdev.discord.stockmarket.hooks;

import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.core.events.message.guild.GuildMessageUpdateEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class MessageHandler extends ListenerAdapter {

	@Override
	public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
		super.onGuildMessageReceived(event);
	}

	@Override
	public void onGuildMessageUpdate(GuildMessageUpdateEvent event) {
		super.onGuildMessageUpdate(event);
	}
}
