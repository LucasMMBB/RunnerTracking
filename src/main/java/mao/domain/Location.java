package mao.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Embedded;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import java.util.Date;

/**
 * Location Class
 * Runner Information Details
 * */

// LOCATIONS ORMapping
// id, unit_band_make, runningid, customerName, unitNumber

// JOSN to Object and Object to JSON libraray Jackson lib
// JSON serilization and deserilization

// frontend JSON <-> Object model   <->   Relational Model

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@Entity
@Table(name = "LOCATIONS")
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
    @Id
    @GeneratedValue
    private long id;

    @Embedded
    @AttributeOverride(name="bandMake", column=@Column(name="unit_band_make"))
    private UnitInfo unitInfo;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name="fmi", column = @Column(name="medical_fmi")),
            @AttributeOverride(name="bfr", column = @Column(name="medical_bfr"))
    })
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
    @JsonCreator
    public Location(@JsonProperty("runningId") String runningId){this.unitInfo = new UnitInfo(runningId);}

    public Location(UnitInfo unitInfo){this.unitInfo = unitInfo;}

    public Location(UnitInfo unitInfo, MedicalInfo medicalInfo) {
        this.unitInfo = unitInfo;
        this.medicalInfo = medicalInfo;
    }

}
