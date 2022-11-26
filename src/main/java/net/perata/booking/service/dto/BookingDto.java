package net.perata.booking.service.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class BookingDto {

    private Long id;
    private String name;
    private String from;
    private String to;
    private List<ReferenceDto> references = new ArrayList<>();

}
