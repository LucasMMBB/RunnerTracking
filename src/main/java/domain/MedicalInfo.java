package domain;

import lombok.Data;

@Data
public class MedicalInfo {

    public long getBfr() {
        return bfr;
    }

    public void setBfr(long bfr) {
        this.bfr = bfr;
    }

    public long getFmi() {
        return fmi;
    }

    public void setFmi(long fmi) {
        this.fmi = fmi;
    }

    private long bfr;

    private long fmi;

    public MedicalInfo(){

    }

    public MedicalInfo(long bfr, long fmi){
        this.bfr = bfr;
        this.fmi = fmi;
    }
}
