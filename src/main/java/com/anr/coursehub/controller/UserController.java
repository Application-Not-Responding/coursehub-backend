package com.anr.coursehub.controller;

import com.anr.openapi.api.UsersApi;
import com.anr.openapi.model.Organizer;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class UserController implements UsersApi {

    @Override
    public ResponseEntity<Void> loginOrganizer(Organizer organizer) {
        return UsersApi.super.loginOrganizer(organizer);
    }

    @Override
    public ResponseEntity<Void> registerOrganizer(Organizer organizer) {
        return UsersApi.super.registerOrganizer(organizer);
    }
}
