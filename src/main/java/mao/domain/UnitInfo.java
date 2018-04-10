package mao.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import javax.persistence.Embeddable;

/**
 * UnitInfo class
 * */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@Embeddable
public class UnitInfo {

    private final String runningId; // can't be modified after init an value
    private String bandMake;
    private String customerName;
    private String unitNumber;

    public UnitInfo(){
        this.runningId = "";
    }

    public UnitInfo(String runningId){
        this.runningId = runningId;
    }

    public UnitInfo(String runningId, String bandMake, String customerName, String unitNumber){
        this.runningId = runningId;
        this.bandMake = bandMake;
        this.customerName = customerName;
        this.unitNumber = unitNumber;
    }

}
