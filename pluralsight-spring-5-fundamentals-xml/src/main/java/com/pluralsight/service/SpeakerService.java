package com.pluralsight.service;

import com.pluralsight.model.Speaker;
import com.pluralsight.repository.HibernateSpeakerRepository;
import com.pluralsight.repository.SpeakerRepository;

import java.util.List;

public class SpeakerService implements ISpeakerService {
    private SpeakerRepository repository;

    public SpeakerService() {
    }

    public SpeakerService(SpeakerRepository repository) {
        this.repository = repository;
    }

    public void setRepository(SpeakerRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Speaker> findAll() {
        return this.repository.findAll();

    }
}
