package com.ssaldarriaga.sprintpulse.backlog.task;

import com.ssaldarriaga.sprintpulse.common.BaseEntity;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Task extends BaseEntity {

    private Integer assignedTo;
    private Integer backlogElementId;
    private Integer estimatedHours;
    private Integer actualHours;

}