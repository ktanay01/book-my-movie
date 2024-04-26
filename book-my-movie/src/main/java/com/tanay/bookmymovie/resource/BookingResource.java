package com.tanay.bookmymovie.resource;


import lombok.*;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.tanay.bookmymovie.enums.SeatType;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
@ToString
public class BookingResource {

	@NotEmpty(message = "SeatNumbers cannot be empty")
	private Set<String> seatsNumbers;

	@Min(value = 1, message = "Invalid user ID")
	private long userId;

	@Min(value = 1, message = "Invalid show ID")
	private long showId;

	@NotNull(message = "seatType cannot be null")
	private SeatType seatType;

}