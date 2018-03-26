package com.dockdev.discord.stockmarket.core;

import static net.dv8tion.jda.core.AccountType.BOT;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

import javax.security.auth.login.LoginException;

import com.dockdev.discord.stockmarket.hooks.GenericListener;
import com.dockdev.discord.stockmarket.hooks.MessageHandler;
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

		builder.addEventListener(new GenericListener(), new MessageHandler());

		try {
			jda = builder.buildAsync();
		} catch (LoginException e) {
			e.printStackTrace();
		}
	}
}
