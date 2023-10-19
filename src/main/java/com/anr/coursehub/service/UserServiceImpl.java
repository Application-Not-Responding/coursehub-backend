package com.anr.coursehub.service;

import com.anr.coursehub.repository.OrganizerRepository;
import com.anr.coursehub.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final StudentRepository studentRepository;
    private final OrganizerRepository organizerRepository;

}
