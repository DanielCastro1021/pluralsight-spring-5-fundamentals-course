package com.pluralsight.repository;

import com.pluralsight.model.Speaker;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository("speakerRepository")
public class HibernateSpeakerRepository implements SpeakerRepository {
    @Override
    public List<Speaker> findAll() {
        List<Speaker> speakers = new ArrayList<>();
        Speaker speaker = new Speaker();
        speaker.setFirstName("Daniel");
        speaker.setLastName("Castro");
        speakers.add(speaker);
        return speakers;
    }
}
