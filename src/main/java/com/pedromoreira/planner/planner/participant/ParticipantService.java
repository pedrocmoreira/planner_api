package com.pedromoreira.planner.planner.participant;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ParticipantService {

    public void registerParticipantsToEvent(List<String> participants_to_invite, UUID tripId){

    }

    public void triggerConfirmationEmailToParticipants(UUID tripId){}
}
