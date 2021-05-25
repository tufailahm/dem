package com.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProjectStatusChangeDto {
    Long id;		//199

    String productName;	//iPhone

    String authorEmailAddress;	//athira@gmail.com

    String authorFullName;	//Athira  P Jaya
}
