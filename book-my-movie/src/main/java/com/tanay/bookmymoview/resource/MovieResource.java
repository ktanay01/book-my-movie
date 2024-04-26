package com.tanay.bookmymoview.resource;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import com.tanay.bookmymoview.enums.Genre;


@NoArgsConstructor
@Builder
@AllArgsConstructor
@Data
public class MovieResource {

	private long id;

	private String title;

	private Genre genre;

	private List<ReviewResource> reviews;

}