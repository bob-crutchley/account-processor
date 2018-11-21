package com.qa.producer.reciever;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.qa.producer.domain.Offer;
import com.qa.producer.domain.Ticket;

@Component
public class AccountReceiver {

	private int ticketCount = 1;
	private int offerCount = 1;

	@JmsListener(destination = "TicketQueue", containerFactory = "myFactory")
	public void receiveMessage(Ticket ticket) {
		String ticketMessage = "<" + ticketCount + "> Received1 <" + ticket + ">";
		System.out.println(ticketMessage);
		ticketCount++;
	}

	@JmsListener(destination = "OfferQueue", containerFactory = "myFactory")
	public void receiveMessage(Offer offer) {
		String offerMessage = "<" + offerCount + "> Received1 <" + offer + ">";
		System.out.println(offerMessage);
		offerCount++;
	}

	
}
