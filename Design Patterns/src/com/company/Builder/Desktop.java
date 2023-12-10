package com.company.Builder;

import lombok.Builder;
import lombok.ToString;


@Builder
@ToString
public class Desktop {

    String monitor;
    String keyboard;
    String mouse;
    String speaker;
    String ram;
    String processor;
    String motherboard;

}
