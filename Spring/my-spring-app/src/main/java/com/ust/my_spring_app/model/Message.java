package com.ust.my_spring_app.model;

import java.time.LocalTime;

public record Message(String text, LocalTime time,  String sender) {

}
