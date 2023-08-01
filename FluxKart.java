package com.crio. FluxKart.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"id"})
public class FluxKart {
    private String id;
    private Double phoneNumber;
    private String email;
    private String linkedid;
    private String linkPrecedence;
    private String createdAt;
    private String updatedAt;
    private String deletedAt;
}
