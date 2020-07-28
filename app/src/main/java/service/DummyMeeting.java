package service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import model.Meeting;

public abstract class DummyMeeting {
    public static List<Meeting> DUMMY_MEETING = Arrays.asList(
        new Meeting("16h03", "12", "Obelix", "randomusers@lamzone.com")
    ) ;

}
