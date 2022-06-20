package com.pluralsight.service;

import com.pluralsight.model.Speaker;
import com.pluralsight.repository.HibernateSpeakerRepository;
import com.pluralsight.repository.SpeakerRepository;

import java.util.List;

public class SpeakerService implements ISpeakerService {
    private SpeakerRepository repository = new HibernateSpeakerRepository();

    @Override
    public List<Speaker> findAll() {
        return this.repository.findAll();

    }
}
