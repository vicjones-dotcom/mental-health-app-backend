package com.example.mentalhealthbackend;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
public class EmotionsController {
    List<Emotions> emotions = new ArrayList<Emotions>();

    public EmotionsController() {
        Emotions anger = new Emotions("negative", "anger");
        emotions.add(anger);
        Emotions sadness = new Emotions("negative", "sadness");
        emotions.add(sadness);
        Emotions relaxation = new Emotions("positive", "relaxation");
        emotions.add(relaxation);
    }

    // GET EMOTIONS
    @GetMapping("/emotions")
    public List<Emotions> getEmotions() {
        return this.emotions;
    }

//    // GET EMOTION BY TYPE
//    @GetMapping("/emotions/{emotionType}")
//    public Emotions getEmotion(@PathVariable String emotionType) {
//        return this.emotions.get(emotionType);
//    }

    @PostMapping("/emotion")
    public Emotions addEmotion(@RequestBody Emotions emotion) {
        this.emotions.add(emotion);
        return emotion;
    }

//    @DeleteMapping("/emotions/{emotionType}")
//    public Emotions deleteEmotion(String type) {
//        for (Emotions emotion : emotions) {
//            if (emotion.getEmotion().equals(emotionType)) {
//                this.emotions.remove(emotion);
//                return emotion;
//            }
//        }
//    }








}
