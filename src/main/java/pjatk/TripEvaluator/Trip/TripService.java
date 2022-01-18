package pjatk.TripEvaluator.Trip;

import pjatk.TripEvaluator.bazaDanych.TripRepository;

public class TripService {


    private final TripRepository tripRepository;

    public TripService(TripRepository tripRepository) {
        this.tripRepository = tripRepository;
    }
}
