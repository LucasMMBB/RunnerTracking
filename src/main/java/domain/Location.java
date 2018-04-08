package domain;

import lombok.Data;

import java.util.Date;

/**
 * Location Class
 * Runner Information Details
 * */
@Data
public class Location {

    enum GpsStatus{
        EXELLENT,
        OK,
        UNRELIABLE,
        BAD,
        NOFIX,
        UNKNOWN
    }

    public enum RunnerMovementType{
        STOPPED,
        IN_MOTION
    }

    private UnitInfo unitInfo;
    private MedicalInfo medicalInfo;

    private double latitude;
    private double longitude;
    private String heading;
    private double gpsSpeed;
    private GpsStatus gpsStatus;
    private double odometer;
    private double totalRunningTime;
    private double totalIdleTime;
    private double totalCalorieBurnt;
    private Date timestamp = new Date();
    private String gearProvider;
    private RunnerMovementType runnerMovementType;
    private String serviceType;

    public Location(){
        this.unitInfo = null;
    }

    public Location(UnitInfo unitInfo, MedicalInfo medicalInfo) {
        this.unitInfo = unitInfo;
        this.medicalInfo = medicalInfo;
    }



    // getter and setter


}
