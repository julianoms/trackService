package com.trackService.consumers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.trackService.dtos.TrackDto;
import com.trackService.exceptions.TrackServiceException;
import com.trackService.messages.ErrorMessages;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.kafka.receiver.ReceiverRecord;

@Component
@RequiredArgsConstructor
@Slf4j
public class TrackConsumer {

    private ObjectMapper objectMapper = new ObjectMapper();

    private final Flux<ReceiverRecord<String, String>> reactiveKafkaReceiver;

    @EventListener(ApplicationStartedEvent.class)
    public void onMessage() {
        reactiveKafkaReceiver
                .doOnNext(r -> log.info(r.value()))
                .doOnError(e -> log.error("KafkaFlux exception", e))
                .subscribe();
    }

    private String toString(TrackDto trackDto) {
        try {
            return objectMapper.writeValueAsString(trackDto);
        } catch (JsonProcessingException e) {
            throw new TrackServiceException(ErrorMessages.MAPPING_ERROR, e);
        }
    }
}
