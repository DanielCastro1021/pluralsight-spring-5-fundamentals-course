package com.pluralsight.service;

import com.pluralsight.model.Speaker;
import com.pluralsight.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service("speakerService")
public class SpeakerService implements ISpeakerService {
    @Autowired
    private SpeakerRepository repository;

    public SpeakerService() {
        System.out.println("SpeakService no args constructor");
    }


    public SpeakerService(SpeakerRepository repository) {
        System.out.println("SpeakService repository constructor");
        this.repository = repository;
    }

    @PostConstruct
    private void init() {
        System.out.println("We're called after constructors");
    }

    @Override
    public List<Speaker> findAll() {
        return this.repository.findAll();

    }

    public void setRepository(SpeakerRepository repository) {
        this.repository = repository;
        System.out.println("SpeakService setter");
    }
}
