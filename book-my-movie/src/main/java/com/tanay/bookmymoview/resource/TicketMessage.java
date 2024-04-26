package com.tanay.bookmymoview.resource;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import com.tanay.bookmymoview.model.Show;
import com.tanay.bookmymoview.model.ShowSeat;

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
