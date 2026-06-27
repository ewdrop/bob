package com.wwj.lianxi.repair;

public class RepairOrder {
    private Long id;
    private String description;
    private String status;

    public RepairOrder(Long id, String description, String status) {
        this.id = id;
        this.description = description;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "RepairOrder{" +
                "id:" + id +
                ", description:'" + description + '\'' +
                ", status:'" + status + '\'' +
                '}';
    }
}
