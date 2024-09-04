package org.example.flytripadaptor.Model.gds;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Order {

    @JsonProperty("name")
    private List<Name> name;

    @JsonProperty("itinerary")
    private List<Segment> itinerary;

    @JsonProperty("receivedFrom")
    private String receivedFrom;

    @JsonProperty("Phone")
    private List<Phone> phone;

    @JsonProperty("TicketingTimeLimit")
    private String ticketingTimeLimit;





}
