package net.perata.booking.service.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Min;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class BookingDto {

    private Long id;
    private String name;
    @Min(18)
    private Integer age;
    private String bookFrom;
    private String bookTo;
    private List<ReferenceDto> references = new ArrayList<>();

}
