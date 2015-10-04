package com.github.esteban;

import org.mule.modules.slack.client.model.chat.Message;
import org.mule.modules.slack.client.model.chat.MessageResponse;

public class MessageResponseMock extends MessageResponse {

	public MessageResponseMock(String ok, String text, String channel, String ts) {
		this.setOk(ok);
		Message message = new Message();
		message.setText(text);
		this.setMessage(message);
		this.setChannel(channel);
		this.setTs(ts);
	}

}
