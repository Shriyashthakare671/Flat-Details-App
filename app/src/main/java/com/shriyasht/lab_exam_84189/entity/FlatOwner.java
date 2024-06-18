package com.shriyasht.lab_exam_84189.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;


@Entity(tableName = "flatowner")
public class FlatOwner implements Serializable {
    @PrimaryKey
    private int FlatNo;
    private String Name;
    private String FlatHolderType;
    private double Carpet;

    public FlatOwner() {
    }

    public FlatOwner(int flatNo, String name, String flatHolderType, double carpet) {
        FlatNo = flatNo;
        Name = name;
        FlatHolderType = flatHolderType;
        Carpet = carpet;
    }

    public int getFlatNo() {
        return FlatNo;
    }

    public void setFlatNo(int flatNo) {
        FlatNo = flatNo;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }


    public String getFlatHolderType() {
        return FlatHolderType;
    }

    public void setFlatHolderType(String flatHolderType) {
        FlatHolderType = flatHolderType;
    }

    public double getCarpet() {
        return Carpet;
    }

    public void setCarpet(double carpet) {
        Carpet = carpet;
    }

    @Override
    public String toString() {
        return "FlatList{" +
                "FlatNo=" + FlatNo +
                ", Name='" + Name + '\'' +
                ", FlatHolderType='" + FlatHolderType + '\'' +
                ", Carpet=" + Carpet +
                '}';
    }

}
