package org.example.flytripadaptor.Model;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Order {

    @JsonProperty("name")
    private Name name;

    @JsonProperty()
    private Itinerary itinerary;



}
