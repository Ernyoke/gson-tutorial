package dev.esz;

import java.util.List;

public class StatesModel {
    private String code;
    private String name;
    private List<DistrictModel> districts;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<DistrictModel> getDistricts() {
        return districts;
    }

    public void setDistricts(List<DistrictModel> districts) {
        this.districts = districts;
    }

    @Override
    public String toString() {
        return "StatesModel{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", districts=" + districts +
                '}';
    }
}
