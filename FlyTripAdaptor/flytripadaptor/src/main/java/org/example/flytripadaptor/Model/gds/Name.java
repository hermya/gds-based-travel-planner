package org.example.flytripadaptor.Model.gds;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Name {

    private String firstName;
    private String lastName;
    private String title;
    private String middleName;
    private PassengerType passengerType;
    private String paxId;
}
