package com.devsuperior.dslist.dto;

public class ReplacementDTO {

    private Integer sourceIndex;
    private Integer destinationIndex;

    public Integer getDestinationIndex() {
        return destinationIndex;
    }

    public Integer getSourceIndex() {
        return sourceIndex;
    }

    public void setDestinationIndex(Integer destinationIndex) {
        this.destinationIndex = destinationIndex;
    }
    
    public void setSourceIndex(Integer sourceIndex) {
        this.sourceIndex = sourceIndex;
    }

    
}
