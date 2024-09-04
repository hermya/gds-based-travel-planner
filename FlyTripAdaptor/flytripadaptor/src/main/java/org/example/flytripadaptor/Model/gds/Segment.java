package org.example.flytripadaptor.Model.gds;


import lombok.Builder;
import lombok.Data;

import java.time.OffsetDateTime;

@Data
@Builder
public class Segment {

    private String boardPoint;

    private String offPoint;

    private String actionCode;

    private Integer numberOfPassengers;

    private OffsetDateTime arrivalDateTime;

    private OffsetDateTime departureDateTime;

    private String flightNumber;

    private String classOfService;

    private String marketingCarrierCode;

    private String operatingCarrierCode;

    private String segmentId;

}
