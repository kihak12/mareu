package model;

import java.util.Objects;

public class Meeting {

    /**
     * hours of meeting
     */
    private String hours;

    /**
     * room name for Meeting
     */
    private String room;

    /**
     * Name of meeting
     */
    private String name;

    /**
     * participant of meeting
     */
    private String participant;

    public Meeting(String hours, String room, String name, String users) {
        this.hours = hours;
        this.room = room;
        this.name = name;
        this.participant = participant;
    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getParticipant() {
        return participant;
    }

    public void setName(String participant) {
        this.participant = participant;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Meeting meetings = (Meeting) o;
        return Objects.equals(name, meetings.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

