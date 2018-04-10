package mao.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import javax.persistence.Embeddable;

/**
 * Medical Information class
 * */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@Embeddable
public class MedicalInfo {

    private long bfr;

    private long fmi;

    public MedicalInfo(){

    }

    public MedicalInfo(long bfr, long fmi){
        this.bfr = bfr;
        this.fmi = fmi;
    }
}
