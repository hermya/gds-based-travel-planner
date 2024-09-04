package org.example.flytripadaptor.Model.gds;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Phone {
    private String countryCode;
    private String extension;
    private String number;
}
