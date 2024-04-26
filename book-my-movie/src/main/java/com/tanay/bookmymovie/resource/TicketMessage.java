package com.tanay.bookmymovie.resource;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import com.tanay.bookmymovie.model.Show;
import com.tanay.bookmymovie.model.ShowSeat;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class TicketMessage {

    private String  userName;
    private String  mobile;
    private String email;
    private Show show;
    private List<ShowSeat> seats;
}
