package com.dockdev.discord.stockmarket.core;

import static net.dv8tion.jda.core.AccountType.BOT;

import javax.security.auth.login.LoginException;

import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.OnlineStatus;

public class Bot {

	private static JDA jda;

	public static void main(String[] args) {
		JDABuilder builder = new JDABuilder(BOT);
		builder.setToken("NDI3Mzc2ODIwMTgzMzY3Njkx.DZpK2A.09kKdxi06n50LvrerUvbLXT4I-E");
		builder.setAutoReconnect(true);
		builder.setStatus(OnlineStatus.ONLINE);

		try {
			jda = builder.buildAsync();
		} catch (LoginException e) {
			e.printStackTrace();
		}
	}
}
